/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Entidades;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugadores> jugadores;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }
    
    
    
}

