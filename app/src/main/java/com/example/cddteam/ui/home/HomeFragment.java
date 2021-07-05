package com.example.cddteam.ui.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cddteam.HomeAnticipateActivity;
import com.example.cddteam.HomeArticleCovidActivity;
import com.example.cddteam.HomeArticleFoodActivity;
import com.example.cddteam.HomeArticleHealthActivity;
import com.example.cddteam.HomeCalculActivity;
import com.example.cddteam.HomeDoctorActivity;
import com.example.cddteam.HomeHealthActivity;
import com.example.cddteam.HomeMataActivity;
import com.example.cddteam.HomeMentalActivity;
import com.example.cddteam.R;

public class HomeFragment extends Fragment {
    TextView txt1, txt2, txt4, txt5, txt6, txt7, txt8, txt9, txt10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // viw inflater to parsing
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // initialisation TextView in fragment home to parsing data (carding service)
        txt1 = view.findViewById(R.id.txt_homepeduli2);
        txt2 = view.findViewById(R.id.txt_homepeduli13);
        txt4 = view.findViewById(R.id.txt_homehealth2);
        txt5 = view.findViewById(R.id.txt_homehealth3);
        txt6 = view.findViewById(R.id.txt_homehealth4);
        txt7 = view.findViewById(R.id.txt_homehealth5);
        txt8 = view.findViewById(R.id.txt_homearticle2);
        txt9 = view.findViewById(R.id.txt_homearticle3);
        txt10 = view.findViewById(R.id.txt_homearticle4);

        // onClickListener to parsing TextView fragment to activity (Carding Service Doctor Consultation)
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity(), HomeDoctorActivity.class);
                startActivity(intent1);
            }
        });

        // onClickListener to parsing TextView fragment to activity (Carding Service Health Store)
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(getActivity(), HomeHealthActivity.class);
                startActivity(intent11);
            }
        });

        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14 = new Intent(getActivity(), HomeMataActivity.class);
                startActivity(intent14);
            }
        });

        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent15 = new Intent(getActivity(), HomeMentalActivity.class);
                startActivity(intent15);
            }
        });

        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16 = new Intent(getActivity(), HomeAnticipateActivity.class);
                startActivity(intent16);
            }
        });

        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent17 = new Intent(getActivity(), HomeCalculActivity.class);
                startActivity(intent17);
            }
        });

        txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent18 = new Intent(getActivity(), HomeArticleCovidActivity.class);
                startActivity(intent18);
            }
        });

        txt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent19 = new Intent(getActivity(), HomeArticleHealthActivity.class);
                startActivity(intent19);
            }
        });

        txt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(getActivity(), HomeArticleFoodActivity.class);
                startActivity(intent10);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}