package com.example.recyclerpersonalizado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPersonajes = new ArrayList<PersonajeVo>();
        recyclerPersonajes = (RecyclerView) findViewById(R.id.RecyclerID);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));


        llenarPersonajes();
        AdaptadorPersonajes adapter = new AdaptadorPersonajes(listaPersonajes);
        recyclerPersonajes.setAdapter(adapter);
    }

    private void llenarPersonajes() {
        listaPersonajes.add(new PersonajeVo("Krusty","Informacion",R.drawable.krusti));
        listaPersonajes.add(new PersonajeVo("Homero","Informacion",R.drawable.homero));
        listaPersonajes.add(new PersonajeVo("Marge","Informacion",R.drawable.marge));
        listaPersonajes.add(new PersonajeVo("Bart","Informacion",R.drawable.bart));
        listaPersonajes.add(new PersonajeVo("Lisa","Informacion",R.drawable.lisa));
        listaPersonajes.add(new PersonajeVo("Magie","Informacion",R.drawable.magie));
        listaPersonajes.add(new PersonajeVo("Flanders","Informacion",R.drawable.flanders));
        listaPersonajes.add(new PersonajeVo("Milhouse","Informacion",R.drawable.milhouse));
        listaPersonajes.add(new PersonajeVo("Mr. Burns","Informacion",R.drawable.burns));

    }
}