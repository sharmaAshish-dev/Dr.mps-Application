package com.ashish.drmps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    ChipNavigationBar buttomNavBar;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttomNavBar = findViewById(R.id.bottom_nav);

        if (savedInstanceState == null) {
            buttomNavBar.setItemSelected(R.id.home, true);
            fragmentManager = getSupportFragmentManager();
            HomeFragement homeFragment = new HomeFragement();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragContainer, homeFragment)
                    .commit();

        }

        buttomNavBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            private final String TAG = MainActivity.class.getSimpleName();

            @Override
            public void onItemSelected(int id) {
                Fragment fragment;
                switch (id) {
                    case R.id.home:
                        fragment = new HomeFragement();
                        break;
                    case R.id.Elearning:
                        fragment = new LearningDashboard();
                        break;
                    case R.id.Admission:
                        fragment = new admission();
                        break;
                    case R.id.more:
                        fragment = new moreOptions();
                        break;
                    default:
                        fragment = new HomeFragement();
                        break;
                }

                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragContainer, fragment)
                        .commit();

            }
        });
    }

}