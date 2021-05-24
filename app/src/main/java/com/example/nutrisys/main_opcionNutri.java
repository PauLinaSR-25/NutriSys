package com.example.nutrisys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.nutrisys.controler.PagerController;
import com.example.nutrisys.controler.PagerControllerNutri;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class main_opcionNutri extends AppCompatActivity {


    //Atributos
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tab1,tab2;
    PagerControllerNutri pagerAdapter;


    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_opcion_nutri);

        tabLayout = findViewById(R.id.TLayoutN);
        viewPager = findViewById(R.id.viewPaperN);
        tab1 = findViewById(R.id.HomeN);
        tab2 = findViewById(R.id.eatN);
        pagerAdapter = new PagerControllerNutri(getSupportFragmentManager(),tabLayout.getTabCount());
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

}//class