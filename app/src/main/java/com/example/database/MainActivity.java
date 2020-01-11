package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5;
Button b1,b2;
TextView t1;
String s1,s2,s3,s4,s5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);
        e5=findViewById(R.id.e5);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.e6);
        b2=findViewById(R.id.b2);
        s1=e1.getText().toString();
        s2=e2.getText().toString();
        s3=e3.getText().toString();
        s4=e4.getText().toString();
        s5=e5.getText().toString();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
    }
    public void register(){
        RequestQueue rq= Volley.newRequestQueue(MainActivity.this);
        String url="https://mansi692.000webhostapp.com/database/register.php";
        StringRequest sr=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(MainActivity.this, "datasend", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "data not send", Toast.LENGTH_SHORT).show();
            }
        }){

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> hm=new HashMap<String,String>();
                hm.put("r",s1);
                hm.put("n",s2);
                hm.put("a",s3);
                hm.put("m",s4);
                hm.put("q",s5);
                return hm;
               }
        };
        rq.add(sr);


    }
}
