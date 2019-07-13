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

public class Tier3 extends BaseActivity {

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
                "Agonia de berith",
                "Apocalipsis",
                "Aura sofocante",
                "Bendicion de rhea",
                "Diadema de hecate",
                "Mandoble",
                "Orbe Artico",
                "Orbe de Magi",
                "Santo de Santos",
                "Vara detonante",
                "Vengaza de frosty",
                "Apreton del diablo",
                "Claves de santi",
                "Cuchilla de blitz",
                "Diente de Fenrir",
                "Garra de farnir",
                "La bestia",
                "Lanza de longinus",
                "Muramasa",
                "Omniarma",
                "Punzada de silk",
                "Rompefilas",
                "Amuleto de longevidad",
                "Capa helada",
                "El escudio del perdido",
                "El estandarte rojo",
                "Escudo de roca",
                "Filo de Hyoga",
                "Gloria ancestral",
                "La egida",
                "Manto de Rha",
                "Medallon de troya",
                "Patron de gaia",
                "Cazador de almas",
                "Viento abrasador",
                "Hacha polar",
                "Maldicion de loki"
        );
        for(int i = 0; i<objetos.size(); i++) {
            Model movie = new Model(objetos.get(i), "", "Tier 3" );
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
