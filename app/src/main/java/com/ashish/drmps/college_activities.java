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

public class college_activities extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_activities);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        challengerPage challengerPage = new challengerPage();
        itFest itFest = new itFest();
        NationalConference nationalConference = new NationalConference();
        nssPage nssPage = new nssPage();
        ranbhumiPage ranbhumiPage = new ranbhumiPage();
        ReminiscencePage reminiscencePage = new ReminiscencePage();
        nationalSeminar nationalSeminar = new nationalSeminar();
        collegeFever collegeFever = new collegeFever();

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragment(challengerPage, "challenger");
        viewPagerAdapter.addFragment(itFest, "IT FEST");
        viewPagerAdapter.addFragment(collegeFever, "College Fever");
        viewPagerAdapter.addFragment(nationalSeminar, "National Seminar");
        viewPagerAdapter.addFragment(ranbhumiPage, "RANBHUMI");
        viewPagerAdapter.addFragment(reminiscencePage, "REMINISCENCE");
        viewPagerAdapter.addFragment(nationalConference, "NATIONAL CONFERENCE");
        viewPagerAdapter.addFragment(nssPage, "NSS");
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