package com.ub.mycartavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class PlatosActivity extends AppCompatActivity {

    String [] platos = new String[] {"Bandeja Paisa", "Sancocho", "Mondongo", "Pescado", "Bandeja"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platos);

        ListView lv = findViewById(android.R.id.list);
        ListAdapter la = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, platos);
        lv.setAdapter(la);

    }
}