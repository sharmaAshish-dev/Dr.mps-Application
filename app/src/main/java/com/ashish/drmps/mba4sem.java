package com.ashish.drmps;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class mba4sem extends Fragment {

    private CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12, card13, card14;

    public mba4sem() {
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
        View view = inflater.inflate(R.layout.fragment_mba4sem, container, false);

        card1 = view.findViewById(R.id.card1);
        card2 = view.findViewById(R.id.card2);
        card3 = view.findViewById(R.id.card3);
        card4 = view.findViewById(R.id.card4);
        card5 = view.findViewById(R.id.card5);
        card6 = view.findViewById(R.id.card6);
        card7 = view.findViewById(R.id.card7);
        card8 = view.findViewById(R.id.card8);
        card9 = view.findViewById(R.id.card9);
        card10 = view.findViewById(R.id.card10);
        card11 = view.findViewById(R.id.card11);
        card12 = view.findViewById(R.id.card12);
        card13 = view.findViewById(R.id.card13);
        card14 = view.findViewById(R.id.card14);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/lesson%20plan%20corporate%20governance%20(1).pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/Entrepreneurship_lessonplan_MBA__1_.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/T_D_LESSON_PLAN__2_.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/NEGOTIATION_lessonplan_MBA_-_Copy.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/NEGOTIATION%20&%20COUNSELLING-%20INSTRUCTION%20PLAN-RAHUL.xlsx";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/IMC_Lession_Plan__1_.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/lesson_plan_of_Tax_MBA__2016_01_25_07_21_01_917.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/lession%20plan%20mba%204th%20%20FD.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/Trading%20blocks%20and%20Foreign%20trade%20lesson%20plan%202018.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });


        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/lesson%20plan%20MBA%20VI%20Cross%20Culture%20management%20Jan%202018.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });


        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/DATABASE%20MANAGEMENT%20SYSTEM%20LESSON%20PLAN%20MBA%20IVth.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });


        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/SYSTEM%20ANALYSIS%20&%20DESIGN%20AND%20SOFTWARE%20ENGINEERING%20LESSON%20PLAN%20MBA%20IVth.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });


        card13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/CYBER%20SECURITY%20LESSION%20PLAN%20(%20MBA%20IVth%20).pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });


        card14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.mpsgroup.org.in/estudyzone/mba/MBA_ERP_instruction_plan.pdf";
                Intent intent = new Intent(getActivity(), subject_webview.class);
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

        return view;
    }
}
