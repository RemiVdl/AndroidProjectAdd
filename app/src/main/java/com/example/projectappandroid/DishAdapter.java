/*package com.example.projectappandroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.MyViewHolder> {

    public int[] images;

    public DishAdapter(int[] images){
        this.images = images;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_main,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int image_id = images[position];
        holder.mName.setText("Fied Eggs");
        holder.mPrice.setText("5.50e");
        holder.mImage.setImageResource(R.drawable.img2);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView mName;
        private TextView mPrice;
        private TextView mDescription;
        private ImageView mImage;

        public MyViewHolder(View itemView){
            super(itemView);

            mName = (TextView) itemView.findViewById(R.id.dishTitle);
            mPrice = (TextView) itemView.findViewById(R.id.dishPrice);
            mDescription = (TextView) itemView.findViewById(R.id.dishDescription);
            mImage = (ImageView) itemView.findViewById(R.id.imageMainCourse);
        }
    }
}*/
