package com.example.ankush.explicitintentexamslot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText etName,etRollno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btnSubmit = (Button)findViewById(R.id.btnSubmit);
    etName = (EditText)findViewById(R.id.etName);
    etRollno = (EditText)findViewById(R.id.etRollno);

    btnSubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String n = etName.getText().toString();
            String r = etRollno.getText().toString();

            if(n.length()==0){
                etName.setError("Name is empty");
                etName.requestFocus();
                return;
            }

            if(r.length()==0){
                etRollno.setError("Roll no is empty");
                etRollno.requestFocus();
                return;
            }

            Intent i = new Intent(MainActivity.this,ExamTimeActivity.class);
            i.putExtra("n",n);
            i.putExtra("r",r);
            startActivity(i);
        }
    });

    }
}
