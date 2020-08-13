package com.example.vvceapp;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4 };
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }



    // getItem is called to instantiate the fragment for the given page.
    // Return a PlaceholderFragment (defined as a static inner class below).

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MechanicalFragment mechanicalFragment = new MechanicalFragment();
                return mechanicalFragment;
            case 1:
                ComputerScienceFragment computerScienceFragment = new ComputerScienceFragment();
                return computerScienceFragment;
            case 2:
                ElectricalFragment electricalFragment = new ElectricalFragment();
                return electricalFragment;
            case 3:
                CivilFragment civilFragment = new CivilFragment();
                return civilFragment;
        }
        return null;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "MECH";
            case 1:
                return "CSE";
            case 2:
                return "EEE";
            case 3:
                return "CIVIL";
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }

}
