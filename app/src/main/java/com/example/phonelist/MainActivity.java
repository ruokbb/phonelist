package com.example.phonelist;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private TabLayout mtablayout;
    private ViewPager mviewpager;
    private MyFragmentPagerAdapter myFragmentPagerAdapter;

    private TabLayout.Tab mtab1;
    private TabLayout.Tab mtab2;
    private List<Data> mData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

        mviewpager = findViewById(R.id.viewpager);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        //设置适配器
        mviewpager.setAdapter(myFragmentPagerAdapter);

        //tablayout与Viewpager绑定
        mtablayout = findViewById(R.id.tablayout);
        mtablayout.setupWithViewPager(mviewpager);


        //不是很明白的，大概是Tablayout选项名字的加载
        mtab1 = mtablayout.getTabAt(0);
        mtab2 = mtablayout.getTabAt(1);


        for(int i=0;i<20;i++){
            Data first = new Data("石其鑫","18777731810");
            mData.add(first);
        }

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.phonelist, null);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        PhoneAdapter phoneAdapter = new PhoneAdapter(this,mData);
        recyclerView.setAdapter(phoneAdapter);
    }
}
