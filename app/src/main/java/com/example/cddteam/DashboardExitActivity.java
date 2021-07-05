package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardExitActivity extends AppCompatActivity {
    Pharmacy fer = new Pharmacy();
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_exit);

        button = findViewById(R.id.btnexit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardExitActivity.this, BottomActivity.class);
                startActivity(intent);
            }
        });
    }
}