package com.example.anama.smartharvestingproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private MainActivity ma=new MainActivity();
    private Button signOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        signOut =findViewById(R.id.buttonLogOut);
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.signUout();
                Intent myIntent= new Intent(MenuActivity.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

    }

}
