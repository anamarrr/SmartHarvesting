package com.example.anama.smartharvestingproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddAngajat extends AppCompatActivity {

    EditText nume;
    EditText prenume;
    EditText cnp;
    EditText varsta;
    EditText adresa;
    EditText contact;
    Button addBtn;
    Spinner sex;

    DatabaseReference databaseAngajati;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addangajat);
        databaseAngajati= FirebaseDatabase.getInstance().getReference("angajat");

        nume= findViewById(R.id.nume);
        prenume= findViewById(R.id.prenume);
        cnp= findViewById(R.id.cnp);
        varsta= findViewById(R.id.varsta);
        adresa= findViewById(R.id.adresa);
        contact= findViewById(R.id.contact);
        addBtn= findViewById(R.id.addBtn);
        sex= findViewById(R.id.sex);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addAngajat();

            }
        });



    }
    private void addAngajat(){
        String name=nume.getText().toString().trim();
        String vorName=prenume.getText().toString().trim();
        String persId=cnp.getText().toString().trim();
        String age= varsta.getText().toString().trim();
        String adress = adresa.getText().toString().trim();
        String contactt=contact.getText().toString().trim();

        String gendre= sex.getSelectedItem().toString();

        if(TextUtils.isEmpty(name)||TextUtils.isEmpty(vorName) ||TextUtils.isEmpty(persId)||TextUtils.isEmpty(age)||TextUtils.isEmpty(adress)||TextUtils.isEmpty(contactt) )
        {
            Toast.makeText(this, "Introduceti toate campurile",Toast.LENGTH_LONG).show();
        }else
        {

            String id=databaseAngajati.push().getKey();
            Angajat angajat= new Angajat(id, name, vorName, persId, age, gendre, adress, contactt);
            databaseAngajati.child(id).setValue(angajat);
            Toast.makeText(this, "Angajat adugat",Toast.LENGTH_LONG).show();

        }


    }

}
