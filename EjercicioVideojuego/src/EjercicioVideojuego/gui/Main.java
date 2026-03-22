package EjercicioVideojuego.gui;

import EjercicioVideojuego.logica.VideoJuego;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();

        VideoJuego game1 = new VideoJuego (1, "Half Life", "Steam",1, "Shooter");
        VideoJuego game2 = new VideoJuego (2, "Half Life 2", "Steam",1, "Shooter");
        VideoJuego game3 = new VideoJuego (3, "God of War", "PlayStation",1, "RPG");
        VideoJuego game4 = new VideoJuego (4, "Mario Party", "Nintendo",4, "plataforma");
        VideoJuego game5 = new VideoJuego (5, "Halo", "Xbox",1, "Shooter");

        listaVideojuegos.add(game1);
        listaVideojuegos.add(game2);
        listaVideojuegos.add(game3);
        listaVideojuegos.add(game4);
        listaVideojuegos.add(game5);

        //Recorrido
        for(VideoJuego game : listaVideojuegos){
            System.out.println("Titulo: "+ game.getTitulo() + " Consola " +
                    game.getConsola() + " Cantidad jugadores:  "+game.getCantidadJugadores());
        }

        //Cambio de nombre y jugadores
        game5.setTitulo("Halo 2");
        game5.setCantidadJugadores(2);

        game4.setTitulo("Mario Party Jamboree");
        game4.setCantidadJugadores(3);


        for(VideoJuego game : listaVideojuegos){
            if (game.getConsola().equals("Steam")) {
                System.out.println(game.toString());
            }
        }



    }
}
