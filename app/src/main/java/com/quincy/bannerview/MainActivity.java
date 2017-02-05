package com.quincy.bannerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.quincy.bannerview.view.BannerViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BannerViewPager mViewPager;
    private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (BannerViewPager) findViewById(R.id.view_pager);
        init();
    }

    private void init(){
        mList = new ArrayList<>();
        mList.add("https://static.baydn.com/media/media_store/image/7ffbf4084480462a6db952859e7d8b4d.png");
        mList.add("https://static.baydn.com/media/media_store/image/feeee16e97407bbca8957702a674e421.png");
        mList.add("https://static.baydn.com/media/media_store/image/0121935e7513b1e001d04a39c62b6247.png");
        mViewPager.setData(mList);
    }
}
