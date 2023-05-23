/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia11_actividad01_persona;

import Entidades.Perro;
import Entidades.Persona;

public class Guia11_Actividad01_Persona {

    public static void main(String[] args) {
        Perro per1 = new Perro("Lola", "Chiwawa", 4, "pequeña");
        Perro per2 = new Perro("Daisy", "Foxterrier", 7, "mediana");
        
        Persona p1 = new Persona("Lisa", "Thompson", 23, 33333, per1);
        Persona p2 = new Persona("Carlos", "Perez", 31, 222222, per2);
        
        System.out.println("Persona 1: ");
        System.out.println(p1);
        System.out.println("--------------");
        System.out.println("Persona 2: ");
        System.out.println(p2);

    }
    
}
