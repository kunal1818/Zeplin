package com.example.android.zeplin.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

public class PostFragement extends Fragment {
    private static final int MODE = 2;
    private ArrayList<ModelClass> modelClassArrayList = new ArrayList<ModelClass>();
    private RecyclerView recyclerView;
    private int flag = 0;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycle_view_discover, container, false);

        if (flag == 0) {
            ModelClass modelClass = new ModelClass(R.drawable.paris, "Explore Paris");
            modelClassArrayList.add(modelClass);

            ModelClass modelClass1 = new ModelClass(R.drawable.paris, "Explore Paris");
            modelClassArrayList.add(modelClass1);

            ModelClass modelClass2 = new ModelClass(R.drawable.paris, "Explore Paris");
            modelClassArrayList.add(modelClass2);

            flag = 1;
        }


        AdapterMain adapterMain = new AdapterMain(modelClassArrayList, MODE);
        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapterMain);
        recyclerView.setHasFixedSize(true);

        return view;


    }
}
