package com.example.tareawhatsapp.modelos;

public class ListaChat {
    private String idUsuario;
    private String usuario;
    private String descripcion;
    private String fecha;
    private String perfilUrl;

    public ListaChat() {
    }

    public ListaChat(String idUsuario, String usuario, String descripcion, String fecha, String perfilUrl) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.perfilUrl = perfilUrl;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
}
