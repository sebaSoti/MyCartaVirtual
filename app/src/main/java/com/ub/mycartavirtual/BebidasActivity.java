package com.ub.mycartavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class BebidasActivity extends AppCompatActivity {

    String [] bebidas = new String[] {"Jugos", "Licores", "Gaseosas", "Mazamorras", "Claro"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        ListView lv = findViewById(android.R.id.list);
        ListAdapter la = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, bebidas);
        lv.setAdapter(la);
    }
}