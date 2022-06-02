package com.example.tienda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tienda.Entities.Tienda;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TiendaActivity extends AppCompatActivity {
    List<Tienda> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);


        String contactJson = getIntent().getStringExtra("CONTACT");
        Tienda contact = new Gson().fromJson(contactJson, Tienda.class);



        ImageView ivAvatar = findViewById(R.id.ivAvatar);
        //TextView tvTitulo = findViewById(R.id.tvTiendaTitulo);
       //TextView tvResumen = findViewById(R.id.tvTiednResumen);
        //TextView tvAutor = findViewById(R.id.tvTiendAutor);
        //TextView tvFechaPublicacion = findViewById(R.id.tvTiendFecha);



        Picasso.get().load("http://pngimg.com/uploads/pokemon/pokemon_PNG9.png").into(ivAvatar);
        //Picasso.get().load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/"+contact.Numero+".svg").into(ivAvatar);
        //tvTitulo.setText(contact.Titulo);
       //tvResumen.setText(contact.Resumen);
        //tvAutor.setText(contact.Autor);
        //tvFechaPublicacion.setText(contact.FechaPublicacion);




        Button btnMap1 =  findViewById(R.id.btnMap1);
        Button btnMap2 =  findViewById(R.id.btnMap2);
        Button btnMap3 =  findViewById(R.id.btnMap3);


        btnMap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiendaActivity.this,MapsActivity.class);
                String contact2JSON = new Gson().toJson(contact);
                intent.putExtra("CONTACT", contact2JSON);
                startActivity(intent);
            }
        });
        btnMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiendaActivity.this,MapsActivity.class);
                String contact2JSON = new Gson().toJson(contact);
                intent.putExtra("CONTACT", contact2JSON);
                startActivity(intent);
            }
        });
        btnMap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiendaActivity.this,MapsActivity.class);
                String contact2JSON = new Gson().toJson(contact);
                intent.putExtra("CONTACT", contact2JSON);
                startActivity(intent);
            }
        });

    }
}