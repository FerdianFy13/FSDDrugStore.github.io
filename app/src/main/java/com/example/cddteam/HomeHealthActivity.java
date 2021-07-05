package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeHealthActivity extends AppCompatActivity {
    TextView txt1, txt2, txt3, txt4, txt5, txt6, txt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_health);

        txt1 = findViewById(R.id.texthealth1);
        txt2 = findViewById(R.id.texthealth2);
        txt3 = findViewById(R.id.texthealth3);
        txt4 = findViewById(R.id.texthealth4);
        txt5 = findViewById(R.id.texthealth5);
        txt6 = findViewById(R.id.texthealth6);
        txt7 = findViewById(R.id.texthealth7);


        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HomeHealthActivity.this, HomeFlueActivity.class);
                startActivity(intent1);
            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(HomeHealthActivity.this, HomeRoutineActivity.class);
                startActivity(intent2);
            }
        });

        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(HomeHealthActivity.this, HomeVitaminActivity.class);
                startActivity(intent3);
            }
        });

        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(HomeHealthActivity.this, HomeHealEyesActivity.class);
                startActivity(intent4);
            }
        });

        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(HomeHealthActivity.this, HomePainActivity.class);
                startActivity(intent5);
            }
        });

        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(HomeHealthActivity.this, HomeAntisepticActivity.class);
                startActivity(intent6);
            }
        });

        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(HomeHealthActivity.this, HomeHerbalActivity.class);
                startActivity(intent7);
            }
        });
    }
}