package com.example.tareawhatsapp.adaptadores;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tareawhatsapp.R;
import com.example.tareawhatsapp.modelos.ListaChat;
import com.example.tareawhatsapp.modelos.ListaLlamada;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class AdaptadorListaLlamada extends RecyclerView.Adapter<AdaptadorListaLlamada.Holder> {
    private List<ListaLlamada> lista;
    private Context contexto;

    public AdaptadorListaLlamada(List<ListaLlamada> lista, Context contexto) {
        this.lista = lista;
        this.contexto = contexto;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorListaLlamada.Holder holder, int position) {
        ListaLlamada listaLlamada = lista.get(position);
        holder.txtUsuario.setText(listaLlamada.getUsuario());
        holder.txtFecha.setText(listaLlamada.getFecha());
        if (listaLlamada.getTipoLlamada().equals("Normal")) {
            holder.tipoLlamada.setImageDrawable(contexto.getDrawable(R.drawable.ic_baseline_call_24));
        } else {
            holder.tipoLlamada.setImageDrawable(contexto.getDrawable(R.drawable.ic_baseline_videocam_24));
        }
        if (listaLlamada.getTipoLlamadaRet().equals("Hecha")) {
            holder.tipoLlamadaReturn.setImageDrawable(contexto.getDrawable(R.drawable.ic_baseline_call_made_24));
        } else {
            holder.tipoLlamadaReturn.setImageDrawable(contexto.getDrawable(R.drawable.ic_baseline_call_received_24));
            if (listaLlamada.getTipoLlamadaRet().equals("Perdida")) {
                holder.tipoLlamadaReturn.getDrawable().setTint(Color.parseColor("#fe5252"));
            } else {
                holder.tipoLlamadaReturn.getDrawable().setTint(contexto.getColor(R.color.txt4));
            }
        }
        Glide.with(contexto).load(listaLlamada.getPerfilUrl()).into(holder.perfil);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(contexto).inflate(R.layout.layout_lista_llamadas, parent, false);
        return new Holder(view);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        private TextView txtUsuario, txtFecha;
        private CircularImageView perfil;
        private ImageView tipoLlamada, tipoLlamadaReturn;

        public Holder(@NonNull View itemView) {
            super(itemView);

            txtUsuario = itemView.findViewById(R.id.txtUsuario);
            txtFecha = itemView.findViewById(R.id.txtFecha);
            perfil = itemView.findViewById(R.id.imgPerfil);
            tipoLlamada = itemView.findViewById(R.id.imgCallType);
            tipoLlamadaReturn = itemView.findViewById(R.id.imgCallReturn);
        }
    }
}
