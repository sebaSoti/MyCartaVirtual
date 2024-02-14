package com.ub.mycartavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class EntradasActivity extends AppCompatActivity {

    String [] entradas = new String[] {"Sopa del día", "Sopa de la casa","Patacones", "Empanadas", "Chicharrones"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);

        ListView lv = findViewById(android.R.id.list);
        ListAdapter la = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, entradas);
        lv.setAdapter(la);
    }
}