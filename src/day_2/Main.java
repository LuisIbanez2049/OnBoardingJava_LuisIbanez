package day_2;

import day_2.models.Persona;

import java.util.Scanner;

public class Main {



    public static void main(String[] args){

        Scanner sc = new Scanner(System. in);
        System.out.println("Hello world!!");



        System.out.println("Tienes mascotas?" + "\n" + "Ingrese `si` o `no`");
        String respuesta = sc.nextLine();
        if (respuesta.toLowerCase().equals("si")) {
            System.out.println("Ingrese cantidad de mascotas");
            int respuesta2 = sc.nextInt();
            sc.nextLine();

            int x = respuesta2;
            String[] nombresMascota = new String[x];
            System.out.println(nombresMascota.length);

            for (int i = 0; i < nombresMascota.length; i++) {
                System.out.println("Ingrese nombre de mascota "+"["+(i + 1)+"] : ");
                String nombreMascota = sc.nextLine();
                nombresMascota[i] = nombreMascota;
            }

            System.out.println("Nombre de mascotas \n");
            for (int i = 0; i < respuesta2; i++) {
                System.out.println("-"+nombresMascota[i]);
            }
            // Instanciamos el objeto "juan" de la clase "Persona"
            Persona juan = new Persona("Juan", "Perez", 33, 1.78, 123456, true,nombresMascota);

            juan.mostrarPersonasConMascotas();
        }
        else {
            String[] mascotas = new String[0];
            Persona tomas = new Persona("Tomas", "Alvarez", 22, 1.80, 789456, false,mascotas);
            tomas.mostrarPersonasConMascotas();
        }


    }










}
