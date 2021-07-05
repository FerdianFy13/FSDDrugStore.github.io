package com.example.cddteam.ui.about;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cddteam.AboutDeveloperActivity;
import com.example.cddteam.LoginActivity;
import com.example.cddteam.R;

public class AboutFragment extends Fragment {
    Button btn1;
    TextView txt1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        btn1 = view.findViewById(R.id.btn_about);
        txt1 = view.findViewById(R.id.user_aboutdevelop);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(), AboutDeveloperActivity.class);
                startActivity(intent2);
            }
        });
        return  view;
    }
}