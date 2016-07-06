package com.example.mhues.miproyecto.activity;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.mhues.miproyecto.R;

//ESTA ES LA ACTIVIDAD PRINCIPAL QUE CONTIENE TODOS LOS FRAGMENTS

public abstract class FragmentContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment_container);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Antiguos Alumnos");
        setSupportActionBar(toolbar);


        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container); //se busca si existe un fragment primero por si ya está creado

        if (fragment == null) { // si no, se crea
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }

    protected abstract Fragment createFragment();
}