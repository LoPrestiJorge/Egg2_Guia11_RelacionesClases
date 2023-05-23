/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Servicios;

import Entidades.Equipo;
import Entidades.Jugadores;
import java.util.ArrayList;
import java.util.Scanner;

public class EquipoService {
    ArrayList<Jugadores> jugadores = new ArrayList<>();
    Equipo equipo = new Equipo();
    Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public void cargarJugadores(){
        String opcion;
        do {
            Jugadores jugador = new Jugadores();
            System.out.println("Ingrese el nombre del jugador: ");
            jugador.setNombre(entrada.next());
            System.out.println("Ingrese la posición del jugador: ");
            jugador.setPosicion(entrada.next());
            System.out.println("Ingrese el número de la posición del jugador: ");
            jugador.setNumero(entrada.nextInt());
            
            jugadores.add(jugador);
            equipo.setJugadores(jugadores);
            
            System.out.println("¿Quiere seguir agregando jugadores? S/N");
            opcion = entrada.next();
            
        } while (!opcion.equalsIgnoreCase("N"));
        
    }
    
    public void mostrarJugadores(){
        System.out.println("La lista de jugadores: ");
        for (Jugadores aux : jugadores) {
            System.out.println(aux);
            
        }
    }
    
}
