package com.example.cddteam.ui.Dashboard;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cddteam.DashboardDateActivity;
import com.example.cddteam.DashboardExitActivity;
import com.example.cddteam.DashboardViewActivity;
import com.example.cddteam.DashboardQueueActivity;
import com.example.cddteam.Pharmacy;
import com.example.cddteam.R;

public class DashboardFragment extends Fragment {
    Pharmacy fer = new Pharmacy();
    TextView text1, text3, text4, text5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        text1 = view.findViewById(R.id.textdash1);
        text3 = view.findViewById(R.id.textdash3);
        text4 = view.findViewById(R.id.textdash4);
        text5 = view.findViewById(R.id.textdash5);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity(), DashboardQueueActivity.class);
                startActivity(intent1);
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getActivity(), DashboardViewActivity.class);
                startActivity(intent3);
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent34 = new Intent(getActivity(), DashboardDateActivity.class);
                startActivity(intent34);
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getActivity(), DashboardExitActivity.class);
                startActivity(intent4);
            }
        });

        return view;
    }
}