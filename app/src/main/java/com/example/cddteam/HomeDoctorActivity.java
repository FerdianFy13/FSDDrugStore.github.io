package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeDoctorActivity extends AppCompatActivity {
    TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_doctor);

        // initialisation text view in home doctor activity
        txt1 = findViewById(R.id.textdoctor11);
        txt2 = findViewById(R.id.textdoctor12);
        txt3 = findViewById(R.id.textdoctor13);
        txt4 = findViewById(R.id.textdoctor14);
        txt5 = findViewById(R.id.textdoctor15);
        txt6 = findViewById(R.id.textdoctor16);
        txt7 = findViewById(R.id.textdoctor17);

        // parsing data to activity home gc
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1  = new Intent(HomeDoctorActivity.this, HomeGCActivity.class);
                startActivity(intent1);
            }
        });
//
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(HomeDoctorActivity.this, HomeDTActivity.class);
                startActivity(intent2);
            }
        });
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(HomeDoctorActivity.this, HomeNeuActivity.class);
                startActivity(intent3);
            }
        });

        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(HomeDoctorActivity.this, HomeEyeActivity.class);
                startActivity(intent4);
            }
        });

        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(HomeDoctorActivity.this, HomeInternalActivity.class);
                startActivity(intent5);
            }
        });
//
        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(HomeDoctorActivity.this, HomeNutActivity.class);
                startActivity(intent6);
            }
        });

        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(HomeDoctorActivity.this, HomeCardioActivity.class);
                startActivity(intent7);
            }
        });
    }
}