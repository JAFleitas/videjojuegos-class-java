package com.videojuegos.logica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Videojuegos> videojuegosList = new ArrayList<>();


        // Agregar juegos
        videojuegosList.add(new Videojuegos(123,
                "Banjo Kazooie","Nintendo 64",
                "Plataforma",4));
        videojuegosList.add(new Videojuegos(124,
                "Mario Party","Nintendo 64",
                "Plataforma",4));
        videojuegosList.add(new Videojuegos(125,
                "Age Of Empire II","PC",
                "Estrategia",4));
        videojuegosList.add(new Videojuegos(126,
                "GTA 5","Play Station 4",
                "Rol",1));
        videojuegosList.add(new Videojuegos(127,
                "Naruto","Play Station 4",
                "Aventura",2));


        for (Videojuegos juego:videojuegosList) {

            System.out.println("Titulo: " + juego.getTitulo());
            System.out.println("Nombre de la consola: " + juego.getConsola());
            System.out.println("Cantidad de jugadores: " + juego.getCantidadJugadores());
            System.out.println("---------");
        }


        //Cambiar nombre y cantidad de jugadores de dos videojuegos

        videojuegosList.get(0).setTitulo("Banjo Kazooie 2");
        videojuegosList.get(0).setCantidadJugadores(2);

        videojuegosList.get(1).setTitulo("Super Mario Party");
        videojuegosList.get(1).setCantidadJugadores(1);


        for (Videojuegos juego: videojuegosList){
            if(juego.getConsola().equals("Nintendo 64")) {
                System.out.println(juego.toString());
            }
        }
    }
}