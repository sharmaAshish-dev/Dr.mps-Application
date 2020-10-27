package com.ashish.drmps;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class bca5sem extends Fragment {

    private CardView card1,card2,card3,card4,card5,card6,card7,card8;

    public bca5sem() {
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
        View view = inflater.inflate(R.layout.fragment_bca5sem, container, false);

        card1 = view.findViewById(R.id.card1);
        card2 = view.findViewById(R.id.card2);
        card3 = view.findViewById(R.id.card3);
        card4 = view.findViewById(R.id.card4);
        card5 = view.findViewById(R.id.card5);
        card6 = view.findViewById(R.id.card6);
        card7 = view.findViewById(R.id.card7);
        card8 = view.findViewById(R.id.card8);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/bca/BCA_DBMS_Lesson_Plan.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bca/BCA_java.PDF";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bca/lesson_plan_networking.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bca/BCA_Lesson_Plan_NT.PDF";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "No File", Toast.LENGTH_SHORT).show();
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "No File", Toast.LENGTH_SHORT).show();
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "No File", Toast.LENGTH_SHORT).show();
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/bca/BCA_5_Prev._Q_Papers.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });
        return view;
    }
}