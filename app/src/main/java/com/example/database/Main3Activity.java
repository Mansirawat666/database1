package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
EditText d1,d2;
Button f1;
String s11,s12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        d1=findViewById(R.id.c1);
        d2=findViewById(R.id.c2);
        f1=findViewById(R.id.b3);
        s11=d1.getText().toString();
        s12=d2.getText().toString();
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
