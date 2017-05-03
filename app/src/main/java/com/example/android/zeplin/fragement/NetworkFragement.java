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
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.zeplin.R;
import com.example.android.zeplin.modelClass.ModelClass;
import com.example.android.zeplin.recyclerViewAdapter.AdapterMain;

import java.util.ArrayList;

/**
 * Created by mark63 on 30/4/17.
 */

public class NetworkFragement extends Fragment {
    private static final int MODE = 1;
    private TextView tvHead;
    private int flag = 0;
    private ArrayList<ModelClass> modelClassArrayList = new ArrayList<ModelClass>();
    private RecyclerView recyclerView;
    private LinearLayout linearLayout;


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycle_view_discover, container, false);
        Log.e("erroe", "getValue1");
        //tvHead = (TextView) view.findViewById(R.id.tv_header);
        //  tvHead.setText("My Network");

        linearLayout = (LinearLayout) view.findViewById(R.id.ll_search_layout);


        if (flag == 0) {
//            linearLayout.setVisibility(View.GONE);
            for (int i = 0; i < 6; i++) {
                ModelClass modelClass = new ModelClass(R.drawable.paris, "Paris", "Evelyn");
                modelClassArrayList.add(modelClass);
                ModelClass modelClass1 = new ModelClass(R.drawable.paris, "Paris", "Evelyn");
                modelClassArrayList.add(modelClass1);
                ModelClass modelClass2 = new ModelClass(R.drawable.paris, "Paris", "Evelyn");
                modelClassArrayList.add(modelClass2);

                flag = 1;
            }
        }
        AdapterMain adapterMain = new AdapterMain(modelClassArrayList, MODE);
        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        recyclerView.setAdapter(adapterMain);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);


        return view;
    }


}



