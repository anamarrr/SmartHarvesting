package com.example.anama.smartharvestingproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ListAngajatiActivity extends AppCompatActivity{

    ListView listViewAngajati;
    DatabaseReference databaseAngajati;
    List<Angajat> listaAngajati;



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listangajati);

        listViewAngajati= findViewById(R.id.listViewAngajati);
        databaseAngajati= FirebaseDatabase.getInstance().getReference("angajat");
        listaAngajati= new ArrayList<>();

    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseAngajati.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                listaAngajati.clear();
                for(DataSnapshot angajatiSnapshot : dataSnapshot.getChildren())
                {
                    Angajat angajat= angajatiSnapshot.getValue(Angajat.class);
                    listaAngajati.add(angajat);
                }

                ListaAngajati adapter= new ListaAngajati(ListAngajatiActivity.this, listaAngajati);
                listViewAngajati.setAdapter(adapter);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
