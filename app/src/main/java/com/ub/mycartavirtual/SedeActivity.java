package com.ub.mycartavirtual;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ub.mycartavirtual.databinding.ActivitySedeBinding;

public class SedeActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivitySedeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySedeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng medellin = new LatLng(6.2214507, -75.6182082);
        LatLng envigado = new LatLng(6.1663543, -75.6025292);
        LatLng sabaneta = new LatLng(6.1505797, -75.6271198);
        LatLng bello = new LatLng(6.333927, -75.5644924);

        mMap.addMarker(new MarkerOptions().position(medellin).title("Sede principal"));
        mMap.addMarker(new MarkerOptions().position(envigado).title("Sede envigado"));
        mMap.addMarker(new MarkerOptions().position(sabaneta).title("Sede sabaneta"));
        mMap.addMarker(new MarkerOptions().position(bello).title("Sede bello"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(medellin));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(12));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        //Agregar información detallada en los marcador
    }
}