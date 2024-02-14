package com.ub.mycartavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void conocerEntradas (View v){
        Intent intencion = new Intent(this, EntradasActivity.class);
        startActivity( intencion );
    }

    public void conocerPlatos (View v){
        Intent intencion = new Intent(this, PlatosActivity.class);
        startActivity( intencion );
    }
    public void conocerBebidas (View v){
        Intent intencion = new Intent(this, BebidasActivity.class);
        startActivity( intencion );
    }
    public void conocerSedes (View v){
        Intent intencion = new Intent(this, SedeActivity.class);
        startActivity( intencion );
    }

    public void realizarReserva (View v){

        String contact = " +573196800413";
        String url = "https: //api.whatsapp.com/send?phone=" + contact;

        PackageManager pm = this.getPackageManager();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }
}