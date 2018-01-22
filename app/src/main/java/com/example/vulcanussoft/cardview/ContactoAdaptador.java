package com.example.vulcanussoft.cardview;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Vulcanus Soft on 05/01/2018.
 */

public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder>{
    ArrayList<Contacto> contactos;
    Activity activity;

    public ContactoAdaptador(ArrayList<Contacto> contactos){
        this.contactos=contactos;
        this.activity=activity;
    }


//inflar layout y lo pasara al viewholder para que obtenga los views
    @Override
    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_view_contact,parent,false);
        return new ContactoViewHolder(v);
    }
//asocia cada elemento de la lista a cada view
    @Override
    public void onBindViewHolder(ContactoViewHolder contactoViewHolder, int position) {
    final Contacto contacto=contactos.get(position);

    contactoViewHolder.imgFoto.setImageResource(contacto.getFoto());
    contactoViewHolder.tvNombreCV.setText(contacto.getNombre());
    contactoViewHolder.tvTelefonoCV.setText(contacto.getTelefono());

    contactoViewHolder.imgFoto.setOnClickListener(new View.OnClickListener( ) {
        @Override
        public void onClick(View view) {

           // Toast.makeText(activity,contacto.getNombre(),Toast.LENGTH_SHORT).show();
        }
    });
    }

    @Override
    public int getItemCount() { //cantidad de elementos que contiene la lista
        return contactos.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgFoto;
        private TextView tvNombreCV;
        private TextView tvTelefonoCV;

        public ContactoViewHolder(View itemView) {
            super(itemView);

            imgFoto= (ImageView) itemView.findViewById(R.id.imag1);
            tvNombreCV=(TextView) itemView.findViewById(R.id.text1);
            tvTelefonoCV=(TextView) itemView.findViewById(R.id.text2);

        }
    }
}
