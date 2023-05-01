package com.main.harjoitusty;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class Transfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);


        TabLayout tabLayout = findViewById(R.id.TabLayout);
        ViewPager2 fragmentArea = findViewById(R.id.fragmentArea);

        //TabLayout.Tab homeTab = tabLayout.newTab().setText("Home");
        //TabLayout.Tab trainTab = tabLayout.newTab().setText("Train");
        //TabLayout.Tab battleTab = tabLayout.newTab().setText("Battle");

        //tabLayout.addTab(homeTab);
        //tabLayout.addTab(trainTab);
        //tabLayout.addTab(battleTab);

        TabPagerAdapter tabPagerAdapter = new TabPagerAdapter(this);
        fragmentArea.setAdapter(tabPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                fragmentArea.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //fragmentArea.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            //@Override
            //public void onPageSelected(int position) {
                //super.onPageSelected(position);
                //tabLayout.getTabAt(position).select();
           // }
        //});
    }

    public void backToTheBeginning5(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}