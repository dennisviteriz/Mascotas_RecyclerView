package com.example.mascotas_recyclerview;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

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


import com.example.mascotas_recyclerview.ui.login.LoginActivity;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    int contador;
    private Toolbar toolbar;
    private TabLayout tablaLayout;
    private ViewPager viewPager;

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

        toolbar = findViewById(R.id.toolbar);
        tablaLayout = findViewById(R.id.tablalayout);
        viewPager = findViewById(R.id.viewPager);
        setUpViewPager();



        if (toolbar != null){
            setSupportActionBar(toolbar);
        }






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

        if (id == R.id.contacto2){

            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        }

        if (id == R.id.acerca){

            Intent intent = new Intent(MainActivity.this, Bio.class);
            startActivity(intent);
        }

        return true;
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new fragRecyclerView());
        fragments.add(new FragPerfil());
        return fragments;
    }

    private void setUpViewPager(){

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),agregarFragments()));
        tablaLayout.setupWithViewPager(viewPager);

        tablaLayout.getTabAt(0).setIcon(R.drawable.ic_house);
        tablaLayout.getTabAt(1).setIcon(R.drawable.ic_pet);

    }



}