package com.example.projectappandroid.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projectappandroid.Dish;
import com.example.projectappandroid.R;
import com.example.projectappandroid.RecyclerviewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Main.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Main#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Main extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View v;
    private RecyclerView myrecyclerview;
    private List<Dish> listDish;

    private OnFragmentInteractionListener mListener;
    /*
    private RecyclerView mRecyclerView;
    private int[] images = {
            R.drawable.img1, R.drawable.img2,R.drawable.img3,
            R.drawable.img4, R.drawable.img5, R.drawable.img6,
            R.drawable.img7, R.drawable.img1, R.drawable.img2,
            R.drawable.img3, R.drawable.img4, R.drawable.img5,
            R.drawable.img6, R.drawable.img7
    };
    public DishAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    */
    public Main() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Main.
     */
    // TODO: Rename and change types and number of parameters
    public static Main newInstance(String param1, String param2) {
        Main fragment = new Main();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        /*mRecyclerView = view.findViewById(R.id.recyclerViewMain);
        layoutManager = new GridLayoutManager(getContext(),1);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(layoutManager);
        adapter = new DishAdapter(images);
        mRecyclerView.setAdapter(adapter);*/
        v = inflater.inflate(R.layout.fragment_main, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.recyclerViewMain);
        RecyclerviewAdapter recyclerviewAdapter = new RecyclerviewAdapter(getContext(), listDish);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerviewAdapter);
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        listDish = new ArrayList<>();
        listDish.add(new Dish("Fried Eggs", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 5.50,R.drawable.img1));
        listDish.add(new Dish("Nugets ", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 7.50,R.drawable.img2));
        listDish.add(new Dish("Boeuf Bourgignon", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 8.50,R.drawable.img3));
        listDish.add(new Dish("Bacon Burger", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 9.90,R.drawable.img4));
        listDish.add(new Dish("Bruchetta", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 8.30,R.drawable.img5));
        listDish.add(new Dish("Ramen", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 7.50,R.drawable.img6));
        listDish.add(new Dish("Pork brochette", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 9.0,R.drawable.img7));
        listDish.add(new Dish("Fried Eggs", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 5.50,R.drawable.img1));
        listDish.add(new Dish("Nugets ", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 7.50,R.drawable.img2));
        listDish.add(new Dish("Boeuf Bourgignon", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 8.50,R.drawable.img3));
        listDish.add(new Dish("Bacon Burger", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 9.90,R.drawable.img4));
        listDish.add(new Dish("Bruchetta", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 8.30,R.drawable.img5));
        listDish.add(new Dish("Ramen", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 7.50,R.drawable.img6));
        listDish.add(new Dish("Pork brochette", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 9.0,R.drawable.img7));
        listDish.add(new Dish("Fried Eggs", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 5.50,R.drawable.img1));
        listDish.add(new Dish("Nugets ", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 7.50,R.drawable.img2));
        listDish.add(new Dish("Boeuf Bourgignon", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 8.50,R.drawable.img3));
        listDish.add(new Dish("Bacon Burger", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 9.90,R.drawable.img4));
        listDish.add(new Dish("Bruchetta", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 8.30,R.drawable.img5));
        listDish.add(new Dish("Ramen", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 7.50,R.drawable.img6));
        listDish.add(new Dish("Pork brochette", "Tincidunt ornare massa eget venenatis cras sed felis egestas purus.", 9.0,R.drawable.img7));


    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
