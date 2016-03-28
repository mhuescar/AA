package com.example.mhues.miproyecto.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mhues.miproyecto.R;
import com.example.mhues.miproyecto.adapter.RVAdapter;
import com.example.mhues.miproyecto.model.Person;

import java.util.ArrayList;
import java.util.List;


public class FragmentNoticias extends Fragment {
    private List<Person> persons;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.foto169));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.foto169));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.foto169));
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.foto169));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.foto169));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.foto169));
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.foto169));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.foto169));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.foto169));
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.foto169));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.foto169));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Emma Wilson", "23 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lavery Maiss", "25 years old", R.mipmap.ic_launcher));
        persons.add(new Person("Lillie Watts", "35 years old", R.mipmap.ic_launcher));


        //Para controlar la vista del RecyclerView
        RecyclerView rv = (RecyclerView) root.findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        //hace que el RecyclerView se muestre por defecto con un layout linear
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);

        return root;



    }
}
