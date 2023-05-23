//Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
//y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
//esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
package guia11_actividadteorica02_jugadores;

import Servicios.EquipoService;

public class Guia11_ActividadTeorica02_Jugadores {

    public static void main(String[] args) {
        EquipoService ps = new EquipoService();
        
        ps.cargarJugadores();
        ps.mostrarJugadores();
        
        

    }
    
}
