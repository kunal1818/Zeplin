package com.example.android.zeplin.recyclerViewAdapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.zeplin.R;
import com.example.android.zeplin.modelDiscover.ModelDiscover;

import java.util.ArrayList;

/**
 * Created by mark63 on 29/4/17.
 */

public class DiscoverAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<ModelDiscover> modelDiscoverArrayList;

    private ImageView imageView;
    private TextView tvTitle;

    /**
     * @param modelDiscoverArrayList array list is created
     */
    public DiscoverAdapter(final ArrayList<ModelDiscover> modelDiscoverArrayList) {
        this.modelDiscoverArrayList = modelDiscoverArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_discover, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ModelDiscover objdiscover = modelDiscoverArrayList.get(position);

        ImageView imgParis = imageView;
        imgParis.setImageResource(objdiscover.getImg());

        TextView tvTitle1 = tvTitle;
        tvTitle1.setText(objdiscover.getText());

    }

    @Override
    public int getItemCount() {
        return modelDiscoverArrayList.size();
    }

    /**
     * viewHOlder class is created here
     */

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cvDiscover;

        /**
         * @param itemView pass values
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            cvDiscover = (CardView) itemView.findViewById(R.id.cvParis);
            imageView = (ImageView) itemView.findViewById(R.id.imgParis);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);


        }
    }
}
