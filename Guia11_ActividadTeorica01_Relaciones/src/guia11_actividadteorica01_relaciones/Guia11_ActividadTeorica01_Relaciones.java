/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main
 */
package guia11_actividadteorica01_relaciones;

import Entidades.DNI;
import Entidades.Persona;
import java.util.Scanner;

public class Guia11_ActividadTeorica01_Relaciones {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(entrada.next());
        System.out.println("Ingrese el apellido de la persona: ");
        persona.setApellido(entrada.next());
        DNI dni = new DNI();
        System.out.println("Ingrese el número del DNI: ");
        dni.setNumero(entrada.nextInt());
        
        persona.setDni(dni); //seteamos el dni en la clase persona.
        
        System.out.println(persona);
        

    }
    
}
