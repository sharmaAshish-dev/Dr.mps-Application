package com.ashish.drmps;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class msc_three extends Fragment {

    private CardView card1,card2,card3,card4,card5;

    public msc_three() {
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
        View view = inflater.inflate(R.layout.fragment_msc_three, container, false);

        card1 = view.findViewById(R.id.card1);
        card2 = view.findViewById(R.id.card2);
        card3 = view.findViewById(R.id.card3);
        card4 = view.findViewById(R.id.card4);
        card5 = view.findViewById(R.id.card5);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mscbt/M.Sc.IIIrd_AB.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mscbt/M.Sc-_IIIrd__GE_.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mscbt/M.Sc.IIIrd_bpt.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mscbt/M.Sc-_IIIrd__ES.pdf";
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


        return view;
    }
}