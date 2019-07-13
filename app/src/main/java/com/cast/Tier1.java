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

public class Tier1 extends BaseActivity {

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
                "Anillo de Lapis",
                "Anillo magico",
                "Escrituras antiguas",
                "Pendiente de Fe",
                "Trono de hechizos",
                "Daga",
                "Espada corta",
                "Garrote ensangrentado",
                "Guantes",
                "Mayal",
                "Anillo de vitalidad",
                "Armadura liviana",
                "Collar de vitalidad",
                "Manoplas de gladiador",
                "Tasliman de fuerza",
                "ballesta del cazador"
        );
        for(int i = 0; i<objetos.size(); i++) {
            Model movie = new Model(objetos.get(i),"", "Tier 1");
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
