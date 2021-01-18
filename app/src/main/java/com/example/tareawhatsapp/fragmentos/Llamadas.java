package com.example.tareawhatsapp.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tareawhatsapp.R;
import com.example.tareawhatsapp.adaptadores.AdaptadorListaLlamada;
import com.example.tareawhatsapp.modelos.ListaLlamada;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Llamadas extends Fragment {

    public Llamadas() {
        // Required empty public constructor
    }

    private List<ListaLlamada> lista = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_llamadas, container, false);
        recyclerView = view.findViewById(R.id.recView2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getListaLlamada();

        return view;
    }

    private void getListaLlamada() {
        lista.clear();
        lista.add(new ListaLlamada("1", "Ericka Vélez", "Ayer 9:09 a. m.",
                "https://imagenes.extra.ec/files/image_full/files/fp/uploads/2020/07/27/5f1f1d20d5b1d.r_d.576-381-0.jpeg",
                "Video", "Perdida"));
        lista.add(new ListaLlamada("1", "Ericka Vélez", "16 de enero 2:32 p. m.",
                "https://imagenes.extra.ec/files/image_full/files/fp/uploads/2020/07/27/5f1f1d20d5b1d.r_d.576-381-0.jpeg",
                "Video", "Hecha"));
        lista.add(new ListaLlamada("2", "Scarlett Johansson", "12 de enero 10:37 a. m.",
                "https://e00-marca.uecdn.es/assets/multimedia/imagenes/2019/11/19/15741684944100.jpg",
                "Video", "Recibida"));
        lista.add(new ListaLlamada("3", "Elizabeth Olsen", "12 de enero 10:34 a. m.",
                "https://pley.today/__export/1585158659786/sites/mui/img/2020/03/25/elizabeth-olsen.jpg_1827958188.jpg",
                "Normal", "Hecha"));
        lista.add(new ListaLlamada("2", "Scarlett Johansson", "9 de enero 1:13 p. m.",
                "https://e00-marca.uecdn.es/assets/multimedia/imagenes/2019/11/19/15741684944100.jpg",
                "Normal", "Perdida"));

        recyclerView.setAdapter(new AdaptadorListaLlamada(lista, getContext()));
    }
}