package com.example.vulcanussoft.cardview;

import android.app.ActionBar;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.FloatingActionButton;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contacto> contactos;
    private RecyclerView listaDeContactos;
    Toolbar actionbare=(Toolbar) findViewById(R.id.Bar);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          //   setSupportActionBar(actionbare);

     /*   listaDeContactos= findViewById(R.id.rvContactos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaDeContactos.setLayoutManager(llm);
        inicializarListaDeContactos();
        inicializadorAdaptador();/*
        // Terea: comprender el ciclo for
       /* ArrayList<String> nombresContacto= new ArrayList<>();
        for (Contacto contacto: contactos){
            nombresContacto.add(contacto.getNombre());
        }*/
        Fab();

    }

    public void inicializadorAdaptador(){
        ContactoAdaptador adaptador=new ContactoAdaptador(contactos);
        listaDeContactos.setAdapter(adaptador);
    }
    public void inicializarListaDeContactos(){
        contactos = new ArrayList<Contacto>();

        contactos.add(new Contacto(R.drawable.qwerty1,"Oscar David","oscae@oscar.com","5666666","4/3/4"));
        contactos.add(new Contacto(R.drawable.qwerty1,"Oscar Rodriguez","oscae@oar.com","1455666","4/3/4"));

    }

    private void Fab() {
        FloatingActionButton miFab= findViewById(R.id.floatButton);
        miFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getBaseContext(),getString(R.string.app_name), Toast.LENGTH_SHORT).show();
                Snackbar.make(view,getResources().getString(R.string.app_name),Snackbar.LENGTH_SHORT)
                        .setAction(getResources().getString(R.string.mensaje), new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Log.i("SnackBAR","Click en SnackBar");
                            }
                        }).setActionTextColor(getResources().getColor(R.color.colorPrimary)).show();
            }
        });
    }
}




