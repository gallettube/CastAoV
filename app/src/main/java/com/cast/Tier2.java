package com.cast;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tier2 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);;


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new Adapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();

    }

    private List<Model> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter mAdapter;


    private void prepareMovieData() {
        List<String> objetos = Arrays.asList(
                "Baston de nul",
                "Brazalete de virtud",
                "Collar de virtud",
                "Cuchilla caprichosa",
                "Empalador de vlad",
                "Lagrima de fenix",
                "Mascara espeluznante",
                "Pergamino encantado",
                "Tumba de la parca",
                "Arco de matanza",
                "Claymore letal",
                "Cuchillas de tempestad",
                "Hierro de uriel",
                "Hoz de la muerte",
                "Lanza astral",
                "Maldicion mortal",
                "Martino arcano",
                "Suriken",
                "Cinturon de claridad",
                "Coraza de caballero",
                "Corazon de incubus",
                "Escudo de asterion",
                "Grebas de proteccion",
                "Locura de hercules",
                "Malla del dolor",
                "Manoplas de platino",
                "Voluntad de Odin",
                "Cuchilla de Gnool",
                "Sra puñalada",
                "Veneno de monstruos",
                "Viento susurante"
        );
        for(int i = 0; i<objetos.size(); i++) {
            Model movie = new Model(objetos.get(i), "", "Tier 2");
            movieList.add(movie);
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}
