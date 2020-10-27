package com.ashish.drmps;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;


public class moreOptions extends Fragment {

    LinearLayout layout1, layout2, layout3, layout4, layout5, layout6;

    public moreOptions() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_more_options, container, false);

        layout1 = v.findViewById(R.id.option1);
        layout2 = v.findViewById(R.id.option2);
        layout3 = v.findViewById(R.id.option3);
        layout4 = v.findViewById(R.id.option4);
        layout5 = v.findViewById(R.id.option5);
        layout6 = v.findViewById(R.id.option6);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), AboutPage.class));
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), college_activities.class));
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), gallery.class));
            }
        });
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), infrastructure.class));
            }
        });
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), contactUs.class));
            }
        });
        layout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Clicked Dev", Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

}