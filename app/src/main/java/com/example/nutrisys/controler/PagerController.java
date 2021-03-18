package com.example.nutrisys.controler;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {
    int numOfTabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numOfTabs = behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new home();
            case 1:
                return new ejercicio();
            case 2:
                return new receta();
            case 3:
                return new terapia();
            default:
                return null;
        }//switch
    }//M.getItem

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
