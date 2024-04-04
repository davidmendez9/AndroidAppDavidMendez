package com.example.exament8davidmendez;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class fragment1 extends Fragment {

    RecyclerView rv;
    ArrayList<Tutor> listaTutores;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        listaTutores = aniadirTutores();

        rv = view.findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rv.setAdapter(new Adaptador(listaTutores));

        return view;
    }

    public ArrayList<Tutor> aniadirTutores()
    {
        ArrayList<Tutor> tutores = new ArrayList<>();

        tutores.add(new Tutor("Carlos", "Gómez Pérez", "carlos.gomez@gmail.com", "1ESO-A"));
        tutores.add(new Tutor("María", "López Martínez", "maria.lopez@gmail.com", "1ESO-B"));
        tutores.add(new Tutor("Alejandro", "Martínez Ruiz", "alejandro.martinez@gmail.com", "1ESO-C"));
        tutores.add(new Tutor("Laura", "Rodríguez Sánchez", "laura.rodriguez@gmail.com", "2ESO-A"));
        tutores.add(new Tutor("Pedro", "Fernández García", "pedro.fernandez@gmail.com", "2ESO-B"));
        tutores.add(new Tutor("Sofía", "Hernández López", "sofia.hernandez@gmail.com", "2ESO-C"));
        tutores.add(new Tutor("Javier", "García Martínez", "javier.garcia@gmail.com", "3ESO-A"));
        tutores.add(new Tutor("Isabel", "Díaz Rodríguez", "isabel.diaz@gmail.com", "3ESO-B"));
        tutores.add(new Tutor("Miguel", "Gutiérrez Sánchez", "miguel.gutierrez@gmail.com", "3ESO-C"));
        tutores.add(new Tutor("Ana", "Moreno López", "ana.moreno@gmail.com", "4ESO-A"));
        tutores.add(new Tutor("David", "Romero Martínez", "david.romero@gmail.com", "4ESO-B"));
        tutores.add(new Tutor("Elena", "Suárez Rodríguez", "elena.suarez@gmail.com", "4ESO-C"));
        tutores.add(new Tutor("Lucía", "Martínez González", "lucia.martinez@gmail.com", "1BCH-A"));
        tutores.add(new Tutor("Alberto", "Gómez Fernández", "alberto.gomez@gmail.com", "1BCH-B"));
        tutores.add(new Tutor("Carmen", "López García", "carmen.lopez@gmail.com", "2BCH-A"));
        tutores.add(new Tutor("Francisco", "García Sánchez", "francisco.garcia@gmail.com", "2BCH-B"));

        return tutores;
    }
}