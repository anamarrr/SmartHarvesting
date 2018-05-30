package com.example.anama.smartharvestingproject;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListaAngajati extends ArrayAdapter<Angajat>{
    private Activity context;
    private List<Angajat> listaAngajati;

    public ListaAngajati(Activity context, List <Angajat> listaAngajati) {
        super(context, R.layout.angajati_list_layout, listaAngajati);
        this.context=context;
        this.listaAngajati=listaAngajati;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem =inflater.inflate(R.layout.angajati_list_layout, null, true);

        TextView textViewNume = listViewItem.findViewById(R.id.textViewNume);
        TextView textViewPrenume = listViewItem.findViewById(R.id.textViewPrenume);
        TextView textViewCNP = listViewItem.findViewById(R.id.textViewCNP);
        TextView textViewVarsta = listViewItem.findViewById(R.id.textViewVarsta);
        TextView textViewSex = listViewItem.findViewById(R.id.textViewSex);
        TextView textViewDomiciliu = listViewItem.findViewById(R.id.textViewDomiciliu);
        TextView textViewContact = listViewItem.findViewById(R.id.textViewContact);

        Angajat angajat= listaAngajati.get(position);

        textViewNume.setText(angajat.getNume());
        textViewPrenume.setText(angajat.getPrenume());
        textViewCNP.setText(angajat.getCnp());
        textViewVarsta.setText(angajat.getVarsta());
        textViewSex.setText(angajat.getSex());
        textViewDomiciliu.setText(angajat.getDomiciliu());
        textViewContact.setText(angajat.getContact());

        return listViewItem;

    }
}
