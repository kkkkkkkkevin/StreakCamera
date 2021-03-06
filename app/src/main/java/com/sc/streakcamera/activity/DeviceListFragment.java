package com.sc.streakcamera.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sc.streakcamera.R;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;

/**
 * Created by Administrator on 2016/4/13.
 */
public class DeviceListFragment extends BaseSampleActivity {
    ViewPagerAdapter mAdapter;
    ViewPager mPager;
    PageIndicator mIndicator;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new ViewPagerAdapter(getChildFragmentManager());
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.devicelist, container,false);


        mPager = (ViewPager) view.findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (CirclePageIndicator) view.findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        mIndicator.setCurrentItem(0);         //每次载入都是第一个page

        return view;

    }
}
