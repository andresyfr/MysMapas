package com.andrescaicedo.mysmapas;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        LatLng Colombia = new LatLng(4.701729593357428, -74.3418115);
        mMap.addMarker(new MarkerOptions().position(Colombia).title("Marker in Colombia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Colombia));

        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapmaloka))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .title("Maloka")
                .position(new LatLng(4.655561601293195, -74.10945989999999)));

        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapsalto))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .title("Salto del tequendama")
                .position(new LatLng(4.576585401271161, -74.29643229999999)));

        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapcentrocultural))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .title("Centro cultural gabriel García Márquez")
                .position(new LatLng(4.597684401277044, -74.07390630000003)));

        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.mapbiblioteca))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .title("Biblioteca virgilio barco")
                .position(new LatLng(4.65705630129363, -74.08846760000006)));
    }
}
