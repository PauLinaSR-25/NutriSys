package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.nutrisys.controler.PagerControllerNutri;
import com.example.nutrisys.controler.PagerControllerPsico;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class main_opcionPsico extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1,tab2;
    PagerControllerPsico pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_opcion_psico);
        tabLayout = findViewById(R.id.TLayoutP);
        viewPager = findViewById(R.id.viewPaperP);
        tab1 = findViewById(R.id.HomeP);
        tab2 = findViewById(R.id.terapiaP);
        pagerAdapter = new PagerControllerPsico(getSupportFragmentManager(),tabLayout.getTabCount());
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