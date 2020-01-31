package com.indah.learnviewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private MyAdapter myAdapter;
    private TabLayout tabMenu;

    ArrayList<String> menuTitleData = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        generateTitle();

        viewPager = findViewById(R.id.viewpager);
        //myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter = MyAdapter.newInstance(getSupportFragmentManager(), menuTitleData,data);
        viewPager.setAdapter(myAdapter);

        tabMenu = findViewById(R.id.tab_layout);
        tabMenu.setupWithViewPager(viewPager);
    }

    //membuat dumy title data
    private void generateTitle(){
        menuTitleData.add("Promo");
        menuTitleData.add("A La Carte");
        menuTitleData.add("Paket Hemat");
        menuTitleData.add("Ayam");
        menuTitleData.add("Makanan");
        menuTitleData.add("Minuman");
    }

    private void generateData(){
        data.add("Data 1");
        data.add("Data 2");
        data.add("Data 3");
        data.add("Data 4");
        data.add("Data 5");
        data.add("Data 6");

    }
}
