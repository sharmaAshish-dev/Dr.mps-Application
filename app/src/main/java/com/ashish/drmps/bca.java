package com.ashish.drmps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class bca extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bca);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        bca1sem bca1sem = new bca1sem();
        bca2sem bca2sem = new bca2sem();
        bca3sem bca3sem = new bca3sem();
        bca4sem bca4sem = new bca4sem();
        bca5sem bca5sem = new bca5sem();
        bca6sem bca6sem = new bca6sem();


        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(bca1sem, "1st Semester");
        viewPagerAdapter.addFragment(bca2sem, "2nd Semester");
        viewPagerAdapter.addFragment(bca3sem, "3rd Semester");
        viewPagerAdapter.addFragment(bca4sem, "4th Semester");
        viewPagerAdapter.addFragment(bca5sem, "5th Semester");
        viewPagerAdapter.addFragment(bca6sem, "6th Semester");
        viewPager.setAdapter(viewPagerAdapter);


    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments = new ArrayList<>();
        private List<String> fragmentTitle = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            fragmentTitle.add(title);

        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }
    }
}