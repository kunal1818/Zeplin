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
import com.example.android.zeplin.modelDiscover.ModelDiscover;
import com.example.android.zeplin.recyclerViewAdapter.DiscoverAdapter;

import java.util.ArrayList;

/**
 * Created by mark63 on 28/4/17.
 */

public class DiscoverFragement extends Fragment {
    private ArrayList<ModelDiscover> modelDiscoverArrayList = new ArrayList<ModelDiscover>();
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycle_view_discover, container, false);
        ModelDiscover modelClass = new ModelDiscover(R.drawable.paris, "Lorem ipsum dolor sit "
                + "amet, consectetur lorem ipsum dolor sit amet, consectetur lorem ipsum");
        modelDiscoverArrayList.add(modelClass);
        DiscoverAdapter discoverAdapter = new DiscoverAdapter(modelDiscoverArrayList);
        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(discoverAdapter);
        recyclerView.setHasFixedSize(true);

        return view;


    }
}
