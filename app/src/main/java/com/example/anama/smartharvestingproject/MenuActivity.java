package com.example.anama.smartharvestingproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MenuActivity extends AppCompatActivity {
    private MainActivity ma=new MainActivity();
    private Button logOut;
    private Button addAngajat;
    private Button listAngajati;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        logOut =findViewById(R.id.logOut);
        addAngajat=findViewById(R.id.addAngajat);
        listAngajati=findViewById(R.id.listAngajati);

        addAngajat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent myIntent= new Intent(MenuActivity.this, AddAngajat.class);
                startActivity(myIntent);

            }
        });
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.signUout();
                Intent myIntent= new Intent(MenuActivity.this, MainActivity.class);
                startActivity(myIntent);

            }
        });
        listAngajati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.signUout();
                Intent myIntent= new Intent(MenuActivity.this, ListAngajatiActivity.class);
                startActivity(myIntent);

            }
        });




    }

}