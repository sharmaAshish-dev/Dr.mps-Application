package com.ashish.drmps;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class mba1sem extends Fragment {

    private CardView card1,card2,card3,card4,card5,card6,card7,card8,card9;

    public mba1sem() {
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
        View view = inflater.inflate(R.layout.fragment_mba1sem, container, false);

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
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/MBA_I_-_MANAGEMENT_CONCEPTS_AND_INDIAN_ETHOS-copy-1.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mba/MBA_ME.PDF";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mba/lesson_plan__MBA_1st_Financial_Accounting_for_Managers.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mba/LESSON_PLAN_FOR_BS_MBA.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mba/MBA%20I%20-%20OB.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mba/MBA_MM_Lession_Plan.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mba/MBA%201st%20bc%20lesson%202018.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mba/Computer%20Applications%20and%20Management%20Information%20System%20lesson%20plan%20MBA%20I.pdf";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://www.mpsgroup.org.in/estudyzone/mba/mba_internal_exam.PDF";
                Intent intent=new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        return view;
    }
}