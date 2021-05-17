package com.example.nutrisys.controler;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerControllerNutri extends FragmentPagerAdapter {

    int numOfTabs;

    public PagerControllerNutri(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numOfTabs = behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new homeNutri();
            case 1:
                return new recetaNutri();
            default:
                return null;
        }//switch
    }//M.getItem

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
