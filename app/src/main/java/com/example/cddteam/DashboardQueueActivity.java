package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DashboardQueueActivity extends AppCompatActivity {
    Pharmacy fer = new Pharmacy();
    EditText txt1, txt3, txt4, txt5;
//    TextView txt5;

    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_queue);

        txt1 = findViewById(R.id.user_txthmesinn2);
        txt3 = findViewById(R.id.user_txthmesinn3);
        txt4 = findViewById(R.id.user_txthmesinn4);
        txt5 = findViewById(R.id.user_txthmesinn5);

        Button btn1 = findViewById(R.id.btnmesin);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = txt1.getText().toString();
                String name = txt3.getText().toString();
                String need = txt4.getText().toString();
                String queue = txt5.getText().toString();

                if (number.trim().equals("")) {
                    txt1.setError("Number cannot be empty");
                } else if (name.trim().equals("")) {
                    txt3.setError("Name cannot be empty");
                } else if (need.trim().equals("")) {
                    txt4.setError("Need cannot be empty");
                } else if (queue.trim().equals("")) {
                    txt4.setError("Queue cannot be empty");
                } else {
                    Intent send = new Intent(DashboardQueueActivity.this, DashboardViewActivity.class);
                    send.putExtra("number", number);
                    send.putExtra("name", name);
                    send.putExtra("need", need);
                    send.putExtra("queue", queue);
                    startActivity(send);
                }
            }
        });

        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                txt5.setText("Queue To " + num);
            }
        });
    }
}