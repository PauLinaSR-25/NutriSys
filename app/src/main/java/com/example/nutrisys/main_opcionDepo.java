package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.nutrisys.controler.PagerControllerDepo;
import com.example.nutrisys.controler.PagerControllerNutri;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class main_opcionDepo extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1,tab2;
    PagerControllerDepo pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_opcion_depo);

        tabLayout = findViewById(R.id.TLayoutD);
        viewPager = findViewById(R.id.viewPaperD);
        tab1 = findViewById(R.id.HomeD);
        tab2 = findViewById(R.id.ejercicioD);
        pagerAdapter = new PagerControllerDepo(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0){
                    pagerAdapter.notifyDataSetChanged();
                }
                if(tab.getPosition()==1){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }//M.onCreate
}