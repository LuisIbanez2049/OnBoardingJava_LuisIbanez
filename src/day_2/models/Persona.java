package day_2.models;

import javax.print.DocFlavor;

public class Persona {
    String nombre;
    String apllido;
    int edad;
    double altura;
    boolean casado;
    int dni;
    String[] nombreMascotas;

    public Persona(String nombre, String apellido, int edad, double altura, int dni, boolean casado, String[] nombreMascotas){
        this.nombre = nombre;
        this.apllido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
        this.dni = dni;
        this.nombreMascotas = nombreMascotas;
    }

    public void mostrarPersonasConMascotas(){
        System.out.println("Presentacion de ["+this.nombre+"]: \n" + "¡Hola! Mi nombre es ["+this.nombre+"] "+"["+this.apllido+"]");
        System.out.println("Teengo ["+this.edad+"] anios y mido ["+this.altura+"] metros de altura");
        if (this.casado) {
            System.out.println("Estoy casado/a");
        }
        else {
            System.out.println("No estoy casado/a");
        }
        System.out.println("Mi DNI es: "+this.dni);
        if (this.nombreMascotas.length > 0) {
            System.out.println("Mi/s mascota/s se llama/n");
            for (int i = 0; i < this.nombreMascotas.length; i++) {
                System.out.println("- "+this.nombreMascotas[i]);
            }
        }
        else {
            System.out.println("No tengo mascotas.");
        }

    }

}
