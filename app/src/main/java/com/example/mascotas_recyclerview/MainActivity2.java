package com.example.mascotas_recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView ListaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        ListaContactos = findViewById(R.id.idRecycler);




        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        // GridLayoutManager glm = new GridLayoutManager(this,2);

        ListaContactos.setLayoutManager(llm);

        InicializadorMascotas();
        InicializarAdapatador();






    }

    public void InicializadorMascotas(){

        mascotas = new ArrayList<>();

        mascotas.add(new Mascota(R.drawable.mas4,"4","Gallo"));
        mascotas.add(new Mascota(R.drawable.mas5,"3","ROMY"));
        mascotas.add(new Mascota(R.drawable.mas3,"2","Ronny"));
        mascotas.add(new Mascota(R.drawable.mas6,"1","Catty"));



    }
    public void InicializarAdapatador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        ListaContactos.setAdapter(adaptador);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

}