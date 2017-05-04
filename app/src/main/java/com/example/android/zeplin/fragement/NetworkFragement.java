package com.example.android.zeplin.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.zeplin.R;
import com.example.android.zeplin.modelClass.ModelClass;
import com.example.android.zeplin.recyclerViewAdapter.AdapterMain;

import java.util.ArrayList;

/**
 * Created by mark63 on 30/4/17.
 */

public class NetworkFragement extends Fragment {
    private static final int MODE = 1;
    private int flag = 0;
    private ArrayList<ModelClass> modelClassArrayList = new ArrayList<ModelClass>();
    private RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycler_view_network, container, false);
        Log.e("erroe", "getValue1");


        if (flag == 0) {


            ModelClass modelClass = new ModelClass(R.drawable.paris, "Paris", "Evelyn");
            modelClassArrayList.add(modelClass);
            ModelClass modelClass1 = new ModelClass(R.drawable.paris, "Paris", "Evelyn");
            modelClassArrayList.add(modelClass1);
            ModelClass modelClass2 = new ModelClass(R.drawable.paris, "Paris", "Evelyn");
            modelClassArrayList.add(modelClass2);
            ModelClass modelClass3 = new ModelClass(R.drawable.paris, "Paris", "Evelyn");
            modelClassArrayList.add(modelClass3);
            ModelClass modelClass4 = new ModelClass(R.drawable.paris, "Paris", "Evelyn");
            modelClassArrayList.add(modelClass4);
            ModelClass modelClass5 = new ModelClass(R.drawable.paris, "Paris", "Evelyn");
            modelClassArrayList.add(modelClass5);

            flag = 1;

        }
        AdapterMain adapterMain = new AdapterMain(modelClassArrayList, MODE);
        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        recyclerView.setAdapter(adapterMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);


        return view;
    }


}



