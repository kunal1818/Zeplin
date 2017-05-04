package com.example.android.zeplin.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.zeplin.R;


/**
 * Created by mark63 on 29/4/17.
 */

public class HomeFragement extends Fragment {
    private TextView tvdiscover, tvmap, tvpost, tvrequest, tvnetwork;
    private LinearLayout linearLayout;
    private View view;
    private TextView tvHead;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragement_home, container, false);
        final ViewPager vP = (ViewPager) view.findViewById(R.id.viewPager);

        vP.setAdapter(new MyPagerAdapter(getChildFragmentManager()));

        tvdiscover = (TextView) view.findViewById(R.id.tv_discover);
        tvdiscover.setOnClickListener(new View.OnClickListener() {
            // Discover
            @Override
            public void onClick(final View v) {
                vP.setCurrentItem(0);
                tvHead = (TextView) view.findViewById(R.id.tv_header);
                tvHead.setText("Discover");
                linearLayout = (LinearLayout) view.findViewById(R.id.ll_search_layout);
                linearLayout.setVisibility(View.VISIBLE);

            }
        });
        // Map
        tvmap = (TextView) view.findViewById(R.id.tv_map);
        tvmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                vP.setCurrentItem(1);
                tvHead = (TextView) view.findViewById(R.id.tv_header);
                tvHead.setText("Map");
                linearLayout = (LinearLayout) view.findViewById(R.id.ll_search_layout);
                linearLayout.setVisibility(View.GONE);
                FragmentManager fm = getChildFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.framelayout, new MapFragement());
                ft.commit();

            }
        });
        // My Post
        tvpost = (TextView) view.findViewById(R.id.tv_myPost);
        tvpost.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                vP.setCurrentItem(2);
                tvHead = (TextView) view.findViewById(R.id.tv_header);
                tvHead.setText("My Post");
                linearLayout = (LinearLayout) view.findViewById(R.id.ll_search_layout);
                linearLayout.setVisibility(View.VISIBLE);

            }
        });
        // Requests
        tvrequest = (TextView) view.findViewById(R.id.tv_request);
        tvrequest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                vP.setCurrentItem(3);
                tvHead = (TextView) view.findViewById(R.id.tv_header);
                tvHead.setText("New Requests");
                linearLayout = (LinearLayout) view.findViewById(R.id.ll_search_layout);
                linearLayout.setVisibility(View.GONE);


            }
        });
        // Network
        tvnetwork = (TextView) view.findViewById(R.id.tv_myNetwork);
        tvnetwork.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                vP.setCurrentItem(4);
                tvHead = (TextView) view.findViewById(R.id.tv_header);
                tvHead.setText("My Network");
                linearLayout = (LinearLayout) view.findViewById(R.id.ll_search_layout);
                linearLayout.setVisibility(View.GONE);

            }
        });


        vP.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {

            }

            @Override
            public void onPageScrollStateChanged(final int state) {

            }
        });

        return view;
    }

    /**
     * pager adapter is created
     */
    class MyPagerAdapter extends FragmentPagerAdapter {
        /**
         * @param fm fragement manager is created
         */
        public MyPagerAdapter(final FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(final int position) {
            switch (position) {
                case 0:
                    return new DiscoverFragement();

                case 1:
                    return new MapFragement();
                case 2:
                    return new PostFragement();
                case 3:
                    return new RequestFragement();
                case 4:
                    return new NetworkFragement();
                default:
                    return new DiscoverFragement();

            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }

}
