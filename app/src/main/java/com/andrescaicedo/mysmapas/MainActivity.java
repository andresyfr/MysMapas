package com.andrescaicedo.mysmapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa(View v){
        Intent intent =new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void irMapaSalto(View v){
        Intent intent =new Intent(this,MapsSalto.class);
        startActivity(intent);
    }

    public void irMapaMaloka(View v){
        Intent intent =new Intent(this,MapsMaloka.class);
        startActivity(intent);
    }

    public void irMapaCentro(View v){
        Intent intent =new Intent(this,MapsCentroCultural.class);
        startActivity(intent);
    }

    public void irMapaBiblioteca(View v){
        Intent intent =new Intent(this,MapsBiblioteca.class);
        startActivity(intent);
    }
}
