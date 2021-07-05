package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DashboardViewActivity extends AppCompatActivity {
    // include method to initialization activity view
    Pharmacy medicine = new Pharmacy();

    EditText txt1, txt2, txt3, txt4;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_view);

        txt1 = findViewById(R.id.user_txthdaftar1);
        txt2 = findViewById(R.id.user_txthdaftar2);
        txt3 = findViewById(R.id.user_txthdaftar3);
        txt4 = findViewById(R.id.user_txthdaftar4);
        btn = findViewById(R.id.btndaftar);

        Intent sends = getIntent();
        String receivedNumber = sends.getStringExtra("number");
        String receivedName = sends.getStringExtra("name");
        String receivedNeed = sends.getStringExtra("need");
        String receivedQueue = sends.getStringExtra("queue");

        txt1.setText(receivedNumber);
        txt2.setText(receivedName);
        txt3.setText(receivedNeed);
        txt4.setText(receivedQueue);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardViewActivity.this, DashboardDateActivity.class);
                startActivity(intent);
            }
        });
    }
}