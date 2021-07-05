package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cddteam.ui.person.PersonFragment;

public class PersonHelpActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_help);

        btn = findViewById(R.id.btn_personhelp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonHelpActivity.this, PersonHelpActivity.class);
                startActivity(intent);
            }
        });
    }
}