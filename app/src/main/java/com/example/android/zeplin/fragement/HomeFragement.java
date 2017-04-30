package com.example.android.zeplin.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.zeplin.R;


/**
 * Created by mark63 on 29/4/17.
 */

public class HomeFragement extends Fragment {
    private TextView tvdiscover, tvmap, tvpost, tvrequest, tvnetwork;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_home, container, false);
        final ViewPager vP = (ViewPager) view.findViewById(R.id.viewPager);
        vP.setAdapter(new MyPagerAdapter(getChildFragmentManager()));

        tvdiscover = (TextView) view.findViewById(R.id.tv_discover);
        tvdiscover.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                vP.setCurrentItem(0);

            }
        });
        tvmap = (TextView) view.findViewById(R.id.tv_map);
        tvmap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                vP.setCurrentItem(1);
            }
        });
        tvpost = (TextView) view.findViewById(R.id.tv_myPost);
        tvpost.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                vP.setCurrentItem(2);

            }
        });
        tvrequest = (TextView) view.findViewById(R.id.tv_request);
        tvrequest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                vP.setCurrentItem(3);

            }
        });
        tvnetwork = (TextView) view.findViewById(R.id.tv_myNetwork);
        tvnetwork.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                vP.setCurrentItem(4);

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
