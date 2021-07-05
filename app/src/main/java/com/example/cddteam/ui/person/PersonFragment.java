package com.example.cddteam.ui.person;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cddteam.PersonHelpActivity;
import com.example.cddteam.PersonInsuranceActivity;
import com.example.cddteam.PersonKlinikActivity;
import com.example.cddteam.PersonPaymentActivity;
import com.example.cddteam.R;

public class PersonFragment extends Fragment {
    TextView txt1, txt2, txt3, txt4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_person, container, false);

        // Parsing fragment to activity PersonKlinik
        txt1 = view.findViewById(R.id.text1);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getActivity(), PersonKlinikActivity.class);
                startActivity(intent1);
            }
        });

        // Parsing fragment to activity PersonInsurance
        txt2 = view.findViewById(R.id.text2);
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(), PersonInsuranceActivity.class);
                startActivity(intent2);
            }
        });

        // Parsing fragment to activity PersonHelp
        txt3 = view.findViewById(R.id.text3);
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getActivity(), PersonHelpActivity.class);
                startActivity(intent3);
            }
        });

        // Parsing fragment to activity PersonKlinik
        txt4 = view.findViewById(R.id.text4);
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getActivity(), PersonPaymentActivity.class);
                startActivity(intent4);
            }
        });
        return view;
    }
}