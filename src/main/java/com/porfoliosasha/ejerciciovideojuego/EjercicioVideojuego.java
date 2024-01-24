package com.porfoliosasha.ejerciciovideojuego;

import com.porfoliosasha.ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {

    public static void main(String[] args) {

        //Punto 2: Crear ArrayList con 5 videojuegos
        List<VideoJuego> listaVideojuegos = new ArrayList<> ();
        
        VideoJuego video1 = new VideoJuego (123, "Banjo Kazooie", "Nintendo 64", 4, "Plataforma");
        VideoJuego video2 = new VideoJuego (22, "Mortal Kombat", "Sega", 4, "Combate");
        VideoJuego video3 = new VideoJuego (45, "Mario Kart 64", "Nintendo 64", 1, "Plataforma");
        VideoJuego video4 = new VideoJuego (55, "Counter Strike 1.6", "PC", 1, "Shooter");
        VideoJuego video5 = new VideoJuego (123, "Fifa 23", "Playstation 5", 8, "Deporte");
        
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        
        //Punto 3: Mostrar videojuegos por consola
        for (VideoJuego video : listaVideojuegos) {
            System.out.println("Titulo: " + video.getTitulo() +
                    " Consola: " + video.getConsola() +
                    " Cantidad de jugadores: " + video.getCantJugadores());
        }
        
        //Punto 4: Cambio de nombre y jugadores
        video5.setCantJugadores(6);
        video5.setTitulo("Fifa 98");
        
        video4.setCantJugadores(4);
        video4.setTitulo("Counter Strike 2");
        
        //Punto 5: Mostrar unicamente los que sean de nintendo 64
        for (VideoJuego video : listaVideojuegos) {
            if(video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());
            }
        }
        
    }
}
