package com.indah.learnviewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MyAdapter extends FragmentStatePagerAdapter {

    static ArrayList<String> menuTitle = new ArrayList<>();

    private static ArrayList<String> myTitle;
    private static ArrayList<String> myData;

    private static int numOfitems;

    public static MyAdapter newInstance(FragmentManager fragmentManager, ArrayList<String> tittles, ArrayList<String> data){
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myTitle = tittles;
        myData = data;
        numOfitems = data.size();
        return myAdapter;
    }

    public MyAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        SimpleFragment simpleFragment = new SimpleFragment();
        AnotherFragment anotherFragment = new AnotherFragment();
        Fragment item = null;

        switch (position){
            case 0 :
                item = simpleFragment;
                break;
            case 1 :
                item = anotherFragment;
                break;
            default :
                item = simpleFragment;
                break;
        }
        return item;
    }

    @Override
    public int getCount() {
        return numOfitems;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = myTitle.get(position);

        return title;
    }
}
