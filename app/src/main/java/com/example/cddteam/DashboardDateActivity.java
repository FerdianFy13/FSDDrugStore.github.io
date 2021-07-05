package com.example.cddteam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.cddteam.ui.person.PersonFragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DashboardDateActivity extends AppCompatActivity {
    Pharmacy fer = new Pharmacy();
    private DatePickerDialog datePickerDialog2;
    private SimpleDateFormat dateFormatter2;
    private TextView txt1;
    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_date);

        dateFormatter2 = new SimpleDateFormat("dd - MM - yyyy", Locale.US);
        txt1 = (TextView) findViewById(R.id.user_txthdate2);
        button1 = (Button) findViewById(R.id.btnproses);
        button2 = findViewById(R.id.btnproses2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog2();
            }
        });

       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
//               FragmentTransaction fer = getSupportFragmentManager().beginTransaction();
//               fer.replace(R.id.dates, new PersonFragment()). commit();
               Intent intents = new Intent(DashboardDateActivity.this, DashboardExitActivity.class);
               startActivity(intents);
           }
       });
    }

    private void showDateDialog2(){
        Calendar newCalendar = Calendar.getInstance();

        datePickerDialog2 = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                txt1.setText("Date : "+dateFormatter2.format(newDate.getTime()));
            }
        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog2.show();
    }
}
