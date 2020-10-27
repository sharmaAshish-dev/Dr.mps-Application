package com.ashish.drmps;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class bsc_one extends Fragment {

    private CardView card1,card2,card3,card4,card5,card6,card7,card8,card9;

    public bsc_one() {
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
        View view = inflater.inflate(R.layout.fragment_bsc_one, container, false);

        card1 = view.findViewById(R.id.card1);
        card2 = view.findViewById(R.id.card2);
        card3 = view.findViewById(R.id.card3);
        card4 = view.findViewById(R.id.card4);
        card5 = view.findViewById(R.id.card5);
        card6 = view.findViewById(R.id.card6);
        card7 = view.findViewById(R.id.card7);
        card8 = view.findViewById(R.id.card8);
        card9 = view.findViewById(R.id.card9);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/bscbt/B.Sc._Ist_BIOCHEMISTRY_AND_BIOPHYSICS.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bscbt/BSC_BT_Course_No._B.Sc._1_Year__Course_Title_Maths__Biostatistics__Computers_and_Bioinformatics_2015_11_21_03_51_01_545.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bscbt/B.Sc._Ist_BOTANY_FIRST.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bscbt/B.Sc._Ist_INSTRUMENTATION.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bscbt/LESSON_PLAN_Behavioural_Science_B.Sc.Biotech_Ist_Year.PDF";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bscbt/BSC_BT_new_chemistry_B.Sc._I_year_2015_11_21_03_51_09_905.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bscbt/BSC_BT_new_2chemistry_B.Sc._I_year_2015_11_21_03_51_07_827.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bscbt/B.Sc._Ist_Algae__Fungi__Bryophytes_and_Pteridophytes.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bscbt/BSC_BT_lesson_plan_of_B.Sc._1st_year_Botany_1_2015_11_21_03_51_06_858.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        return view;
    }
}