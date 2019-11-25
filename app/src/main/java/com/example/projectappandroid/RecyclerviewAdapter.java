package com.example.projectappandroid;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder>{

    Context mContext;
    List<Dish> mData;
    Dialog mDialog;

    public RecyclerviewAdapter(Context mContext, List<Dish> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.maincourselayout, parent,false);
        final MyViewHolder viewHolder = new MyViewHolder(v);

        mDialog = new Dialog(mContext);
        mDialog.setContentView(R.layout.dialog_dish);

        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        viewHolder.item_dish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mContext, "Test Click"+ String.valueOf(viewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();

                TextView dialog_title_dish = (TextView) mDialog.findViewById(R.id.title_dish_description);
                TextView dialog_price_dish = (TextView) mDialog.findViewById(R.id.price_dish_decription);
                ImageView dialog_image_dish = (ImageView)  mDialog.findViewById(R.id.image_dish_description);

                dialog_title_dish.setText(mData.get(viewHolder.getAdapterPosition()).getName());
                dialog_price_dish.setText(mData.get(viewHolder.getAdapterPosition()).getPrice()+" €");
                dialog_image_dish.setImageResource(mData.get(viewHolder.getAdapterPosition()).getImage());

                mDialog.show();

            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.mName.setText(mData.get(position).getName());
        holder.mPrice.setText(mData.get(position).getPrice()+" €");
        holder.mImage.setImageResource(mData.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private ConstraintLayout item_dish;
        private TextView mName;
        private TextView mPrice;
        private TextView mDescription;
        private ImageView mImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_dish = (ConstraintLayout) itemView.findViewById(R.id.item_main_course);
            mName = (TextView) itemView.findViewById(R.id.dishTitle);
            mPrice = (TextView) itemView.findViewById(R.id.dishPrice);
            mDescription = (TextView) itemView.findViewById(R.id.dishDescription);
            mImage = (ImageView) itemView.findViewById(R.id.imageMainCourse);
        }
    }
}
