package com.videojuegos.logica;

public class Videojuegos {
    private int codigo;
    private String titulo;
    private String consola;
    private String categoria;
    private int cantidadJugadores;

    public Videojuegos() {
    }

    public Videojuegos(int codigo, String titulo, String consola, String categoria, int cantidadJugadores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.categoria = categoria;
        this.cantidadJugadores = cantidadJugadores;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    @Override
    public String toString() {
        return "Videojuegos{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", categoria='" + categoria + '\'' +
                ", cantidadJugadores=" + cantidadJugadores +
                '}';
    }
}
