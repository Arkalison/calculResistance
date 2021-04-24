package com.example.calculresistance.utilities;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.calculresistance.R;

public class AdaptateurSection extends FragmentPagerAdapter {


    private static final int[] TAB_TITRES = new int[]{R.string.section1,R.string.section2,R.string.section3};
    private final Context c;

    public AdaptateurSection(Context context, FragmentManager fm) {
        super(fm);
        c = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position){
            case 0:
                fragment = new Bandes_4();
                break;
            case 1:
                fragment = new Bandes_5();
                break;
            case 2:
                fragment = new Bandes_6();
                break;

        }


        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return c.getResources().getString(TAB_TITRES[position]);
    }
}
