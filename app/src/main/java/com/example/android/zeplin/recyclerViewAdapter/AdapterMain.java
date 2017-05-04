package com.example.android.zeplin.recyclerViewAdapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.zeplin.R;
import com.example.android.zeplin.modelClass.ModelClass;

import java.util.ArrayList;

/**
 * Created by mark63 on 29/4/17.
 */

public class AdapterMain extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<ModelClass> modelClassArrayList;
    private int mode = 0;
    private ImageView imageView;
    private TextView tvTitle;
    private ImageView imageViewNetwork;
    private TextView tvplace;
    private TextView tvname;
    private TextView tvTextEnd;
    private TextView tvTextStart;


    /**
     * @param modelClassArrayList array list is created
     * @param mode                to change places
     */
    public AdapterMain(final ArrayList<ModelClass> modelClassArrayList, final int mode) {
        this.mode = mode;
        this.modelClassArrayList = modelClassArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view;
        if (mode == 0) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_discover, parent, false);
        } else if (mode == 1) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragement_network, parent, false);
        } else if (mode == 2) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragement_post, parent, false);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragement_request, parent, false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ModelClass objdiscover = modelClassArrayList.get(position);
        if (mode == 0) {
            ImageView imgParis = imageView;
            imgParis.setImageResource(objdiscover.getImg());

            TextView tvTitle1 = tvTitle;
            tvTitle1.setText(objdiscover.getText());
        } else if (mode == 1) {

            ImageView imageNetw = imageViewNetwork;
            imageNetw.setImageResource(objdiscover.getImageNetwork());

            TextView textView = tvplace;
            textView.setText(objdiscover.getPlace());

            TextView textViewname = tvname;
            textViewname.setText(objdiscover.getName());
        } else if (mode == 2) {
            ImageView imgParis = imageView;
            imgParis.setImageResource(objdiscover.getImg());

            TextView tvTitle1 = tvTitle;
            tvTitle1.setText(objdiscover.getText());
        } else {
            ImageView imgParis = imageView;
            imgParis.setImageResource(objdiscover.getImg());

            TextView tvTitle1 = tvTitle;
            tvTitle1.setText(objdiscover.getText());

            TextView textView = tvTextStart;
            textView.setText(objdiscover.getText());

            TextView textViewend = tvTextEnd;
            textViewend.setText(objdiscover.getText());

        }

    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    /**
     * viewHOlder class is created here
     */

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cvDiscover, cvMyPost;
        private RelativeLayout relativeLayout;

        /**
         * @param itemView pass values
         */
        public ViewHolder(final View itemView) {
            super(itemView);


            if (mode == 0) {
                Log.e("debug", "help to handel");
                cvDiscover = (CardView) itemView.findViewById(R.id.cvParis);
                imageView = (ImageView) itemView.findViewById(R.id.imgParis);
                tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
//                cvDiscover.setVisibility(View.GONE);

            } else if (mode == 1) {
                imageViewNetwork = (ImageView) itemView.findViewById(R.id.profile_img);
                tvplace = (TextView) itemView.findViewById(R.id.placeName);
                tvname = (TextView) itemView.findViewById(R.id.tv_nameNet);
                relativeLayout = (RelativeLayout) itemView.findViewById(R.id.rl_network);
//                relativeLayout.setVisibility(View.GONE);
            } else if (mode == 2) {
                cvMyPost = (CardView) itemView.findViewById(R.id.cvMyPost);
                imageView = (ImageView) itemView.findViewById(R.id.imgParisPost);
                tvTitle = (TextView) itemView.findViewById(R.id.tv_titleparis);
            } else {
                imageView = (ImageView) itemView.findViewById(R.id.circular_img);
                tvTitle = (TextView) itemView.findViewById(R.id.tv_john);
                tvTextStart = (TextView) itemView.findViewById(R.id.tv_textstart);
                tvTextEnd = (TextView) itemView.findViewById(R.id.tv_textend);
            }
        }
    }
}
