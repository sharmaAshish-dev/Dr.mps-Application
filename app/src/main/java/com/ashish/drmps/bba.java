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

public class bba extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bba);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        bba1sem bba1sem = new bba1sem();
        bba2sem bba2sem = new bba2sem();
        bba3sem bba3sem = new bba3sem();
        bba4sem bba4sem = new bba4sem();
        bba5sem bba5sem = new bba5sem();
        bba6sem bba6sem = new bba6sem();

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(bba1sem, "1st Semester");
        viewPagerAdapter.addFragment(bba2sem, "2nd Semester");
        viewPagerAdapter.addFragment(bba3sem, "3rd Semester");
        viewPagerAdapter.addFragment(bba4sem, "4th Semester");
        viewPagerAdapter.addFragment(bba5sem, "5th Semester");
        viewPagerAdapter.addFragment(bba6sem, "6th Semester");
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