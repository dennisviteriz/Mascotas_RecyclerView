package com.example.mascotas_recyclerview;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import android.content.ClipData;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView ListaContactos;

    int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   /*     contador = 0;
        Button boton01 = findViewById(R.id.button);
       // final TextView text01 = findViewById(R.id.rNumeros);


        boton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador ++;

                text01.setText(contador);

            }
        });
*/



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        

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
        mascotas.add(new Mascota(R.drawable.mas6,"1","Catty"));
        mascotas.add(new Mascota(R.drawable.mas3,"2","Ronny"));
        mascotas.add(new Mascota(R.drawable.mas5,"3","ROMY"));
        mascotas.add(new Mascota(R.drawable.mas4,"4","Gallo"));
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

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.Forward){

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);

        }
        return true;
    }
}