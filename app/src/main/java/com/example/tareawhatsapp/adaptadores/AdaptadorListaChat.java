package com.example.tareawhatsapp.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tareawhatsapp.R;
import com.example.tareawhatsapp.modelos.ListaChat;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class AdaptadorListaChat extends RecyclerView.Adapter<AdaptadorListaChat.Holder> {
    private List<ListaChat> lista;
    private Context contexto;

    public AdaptadorListaChat(List<ListaChat> lista, Context contexto) {
        this.lista = lista;
        this.contexto = contexto;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorListaChat.Holder holder, int position) {
        ListaChat listaChat = lista.get(position);
        holder.txtUsuario.setText(listaChat.getUsuario());
        holder.txtDescripcion.setText(listaChat.getDescripcion());
        holder.txtFecha.setText(listaChat.getFecha());
        Glide.with(contexto).load(listaChat.getPerfilUrl()).into(holder.perfil);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.layout_lista_chats, parent, false);
        return new Holder(view);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private TextView txtUsuario, txtDescripcion, txtFecha;
        private CircularImageView perfil;

        public Holder(@NonNull View itemView) {
            super(itemView);

            txtUsuario = itemView.findViewById(R.id.txtUsuario);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
            txtFecha = itemView.findViewById(R.id.txtFecha);
            perfil = itemView.findViewById(R.id.imgPerfil);
        }
    }
}
