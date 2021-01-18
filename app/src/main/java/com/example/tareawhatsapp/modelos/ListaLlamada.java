package com.example.tareawhatsapp.modelos;

public class ListaLlamada {
    private String idUsuario;
    private String usuario;
    private String fecha;
    private String perfilUrl;
    private String tipoLlamada;
    private String tipoLlamadaRet;

    public ListaLlamada() {
    }

    public ListaLlamada(String idUsuario, String usuario, String fecha, String perfilUrl, String tipoLlamada, String tipoLlamadaRet) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.fecha = fecha;
        this.perfilUrl = perfilUrl;
        this.tipoLlamada = tipoLlamada;
        this.tipoLlamadaRet = tipoLlamadaRet;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPerfilUrl() {
        return perfilUrl;
    }

    public void setPerfilUrl(String perfilUrl) {
        this.perfilUrl = perfilUrl;
    }

    public String getTipoLlamada() {
        return tipoLlamada;
    }

    public void setTipoLlamada(String tipoLlamada) {
        this.tipoLlamada = tipoLlamada;
    }

    public String getTipoLlamadaRet() {
        return tipoLlamadaRet;
    }

    public void setTipoLlamadaRet(String tipoLlamadaRet) {
        this.tipoLlamadaRet = tipoLlamadaRet;
    }
}
