package com.example.ankush.explicitintentexamslot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExamTimeActivity extends AppCompatActivity {


    TextView tvName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_time);
    tvName = (TextView)findViewById(R.id.tvName);


    Intent i = getIntent();
    String n = i.getStringExtra("n");
    String r = i.getStringExtra("r");
    int roll = Integer.parseInt(r);

    if(roll >=1 && roll <=20)
    {
        tvName.setText("Name: "+n+"\nExam Time: 8am - 10am");
    }
    else if(roll > 20 && roll <=100){
        tvName.setText("Name: "+n+"\nExam Time: 11am - 1am");
    }
    else{
        tvName.setText("Invalid Roll Number");
    }

    }
}
