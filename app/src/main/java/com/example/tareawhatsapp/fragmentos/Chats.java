package com.example.tareawhatsapp.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tareawhatsapp.R;
import com.example.tareawhatsapp.adaptadores.AdaptadorListaChat;
import com.example.tareawhatsapp.modelos.ListaChat;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Chats extends Fragment {

    public Chats() {
        // Required empty public constructor
    }

    private List<ListaChat> lista = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerView = view.findViewById(R.id.recView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getListaChat();
        return view;
    }

    private void getListaChat() {
        lista.clear();
        lista.add(new ListaChat("1", "Ericka Vélez", "Hola 1", "6:12 p. m.",
                "https://imagenes.extra.ec/files/image_full/files/fp/uploads/2020/07/27/5f1f1d20d5b1d.r_d.576-381-0.jpeg"));
        lista.add(new ListaChat("2", "Scarlett Johansson", "Hola 2", "Ayer",
                "https://e00-marca.uecdn.es/assets/multimedia/imagenes/2019/11/19/15741684944100.jpg"));
        lista.add(new ListaChat("3", "Elizabeth Olsen", "Hola 3", "16/1/2021",
                "https://pley.today/__export/1585158659786/sites/mui/img/2020/03/25/elizabeth-olsen.jpg_1827958188.jpg"));
        recyclerView.setAdapter(new AdaptadorListaChat(lista, getContext()));
    }
}