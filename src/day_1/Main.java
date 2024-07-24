package day_1;

import java.io.Console;
import java.util.Scanner;

public class Main {

    private static final int CAPACIDAD_MAXIMA = 500; // Capacidad máxima de la bolera
    private static int capacidadActual = 0;  // Capacidad actual ocupada
    private static double dineroRecaudado = 0.0; // Dinero recaudado
    private static final double PRECIO_ENTRADA_NORMAL = 1500.0; // Precio de la entrada normal
    private static final double PRECIO_ENTRADA_VIP = 2000.0; // Precio de la entrada VIP

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //----------------------------------------------Ejercicio 1--------------------------------------------------------------------------------
//        System.out.println("Ingrese su nombre: ");
//        String nombre = scanner.nextLine();
//        System.out.println("Ingrese su apellido: ");
//        String apellido = scanner.nextLine();
//        System.out.println("Ingrese su edad");
//        int edad = scanner.nextInt();

//        System.out.println("Hola mi nombre es: "+nombre+"\n"+"Mi apellido es: "+apellido+"\n"+"Mi edad es: "+edad);


        //----------------------------------------------Ejercicio 2--------------------------------------------------------------------------------
//        System.out.println(mensajeDeBienvenida("Luis Ibañez"));


        //--------------------------------------------------------Ejercicio 3----------------------------------------------------------------------
//        int[] numeros = new int[3];
//        for (int i = 0;  i < numeros.length; i++){
//            System.out.println("Ingrese numero "+"["+(i+1)+"] : ");
//            int numero = scanner.nextInt();
//            numeros[i] = numero;
//        }
//
//        for (int i = 0; i < numeros.length; i++){
//            System.out.println("Numero "+"["+(i+1)+"] "+"es: "+ numeros[i]);
//        }
//        int maxNumero = numeros[0];
//        for (int i = 0; i < numeros.length; i++){
//            if (numeros[i] > maxNumero) {
//                maxNumero = numeros[i];
//            }
//        }
//        System.out.println("El numero mas grande es: ["+maxNumero+"]");



        //--------------------------------------------------------Ejercicio 4----------------------------------------------------------------------
//        System.out.println("Ingrese un numero: ");
//        int numero = scanner.nextInt();
//        System.out.println(numeroEsPar(numero));



        //--------------------------------------------------------Ejercicio 5----------------------------------------------------------------------
//        System.out.println("Ingrese texto 1: ");
//        String texto1 = scanner.nextLine();
//        System.out.println("Ingrese texto 2: ");
//        String texto2 = scanner.nextLine();
//        if (texto1.equals(texto2)) {
//            System.out.println("Los textos son iguales");
//        }
//        else {
//            System.out.println("Los textos son distintos");
//        }


        //--------------------------------------------------------Ejercicio 6----------------------------------------------------------------------
//        System.out.println("Ingrese un numero");
//        int numero = scanner.nextInt();
//        System.out.println(esPrimo(numero));



        //--------------------------------------------------------Ejercicio 7----------------------------------------------------------------------
//        int[][] matriz = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int resultado = sumaImpares(matriz);
//        System.out.println("La suma de los numeros primos es: " + resultado);




        //--------------------------------------------------------Ejercicio 8----------------------------------------------------------------------
//                int[][] matriz = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//                int sumaResultadoPares = sumaPares(matriz);
//        mostrarPares(matriz);
//        System.out.println("La suma de los numeros pares es: " + sumaResultadoPares);




        //--------------------------------------------------------Ejercicio 9 y 10----------------------------------------------------------------------
//        int opcion;
//
//        do {
//            mostrarMenu();
//            opcion = scanner.nextInt();
//
//            switch (opcion) {
//                case 1:
//                    realizarSuma(scanner);
//                    break;
//                case 2:
//                    realizarResta(scanner);
//                    break;
//                case 3:
//                    realizarMultiplicacion(scanner);
//                    break;
//                case 4:
//                    realizarDivision(scanner);
//                    break;
//                case 0:
//                    System.out.println("Saliendo del programa...");
//                    break;
//                default:
//                    System.out.println("Opción no válida, por favor intenta de nuevo.");
//            }
//        } while (opcion != 0);





        //--------------------------------------------------------Ejercicio 11----------------------------------------------------------------------
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    entradaDeDatos(scanner);
                    break;
                case 2:
                    mostrarCapacidadDisponible();
                    break;
                case 3:
                    mostrarDineroRecaudado();
                    break;
                case 4:
                    System.out.println("Cerrando sesión...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        } while (opcion != 4);






    }



//----------------°°°°°°°°°°°°°°°°°----------------------METODOS(FUNCIONES)-----------°°°°°°°°°°°°°°°°°---------------------------------------

    //----------------------------------------------Ejercicio 2--------------------------------------------------------------------------------
//    public static String mensajeDeBienvenida(String nombre){
//        return "Bienvenido: " +  nombre;
//    }

    //----------------------------------------------Ejercicio 4--------------------------------------------------------------------------------
//    public static String numeroEsPar (int numero){
//        if (numero % 2 == 0) {
//            return "El numero es par";
//        }
//        return "El numero es impar";
//    } si es divisible por dos o por el numeor divido por 2
    //Si es uno o 2 son primos.


    //----------------------------------------------Ejercicio 6--------------------------------------------------------------------------------
//    public static String esPrimo(int numero) {
//        if (numero <= 1) {
//            return "El número no es primo";
//        }
//        if (numero == 2) {
//            return "El número es primo";
//        }
//        if (numero % 2 == 0) {
//            return "El número no es primo";
//        }
//        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
//            if (numero % i == 0) {
//                return "El número no es primo";
//            }
//        }
//        return "El número es primo";
//    }


    //--------------------------------------------------------Ejercicio 7----------------------------------------------------------------------
//    public static int sumaImpares(int [][] matriz){
//        int suma = 0;
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                if (matriz[i][j] % 2 != 0) {
//                    suma += matriz[i][j];
//                }
//            }
//        }
//        return suma;
//    }



    //--------------------------------------------------------Ejercicio 8----------------------------------------------------------------------
//        public static int sumaPares(int [][] matriz){
//        int suma = 0;
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                if (matriz[i][j] % 2 == 0) {
//                    suma += matriz[i][j];
//                }
//            }
//        }
//        return suma;
//    }
//
//    public static void mostrarPares(int [][] matriz){
//        int suma = 0;
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                if (matriz[i][j] % 2 == 0) {
//                    System.out.println("Numero par: " + matriz[i][j] + "\n");
//                }
//            }
//        }
//    }






    //--------------------------------------------------------Ejercicio 9 y 10----------------------------------------------------------------------
//    public static void mostrarMenu() {
//        System.out.println("\nMenú de Calculadora:");
//        System.out.println("1. Suma");
//        System.out.println("2. Resta");
//        System.out.println("3. Multiplicación");
//        System.out.println("4. División");
//        System.out.println("0. Salir");
//        System.out.print("Elija una opción: ");
//    }
//
//    public static void realizarSuma(Scanner scanner) {
//        System.out.print("Ingrese el primer número: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Ingrese el segundo número: ");
//        double num2 = scanner.nextDouble();
//        System.out.println("Resultado: " + (num1 + num2));
//    }
//
//    public static void realizarResta(Scanner scanner) {
//        System.out.print("Ingrese el primer número: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Ingrese el segundo número: ");
//        double num2 = scanner.nextDouble();
//        System.out.println("Resultado: " + (num1 - num2));
//    }
//
//    public static void realizarMultiplicacion(Scanner scanner) {
//        System.out.print("Ingrese el primer número: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Ingrese el segundo número: ");
//        double num2 = scanner.nextDouble();
//        System.out.println("Resultado: " + (num1 * num2));
//    }
//
//    public static void realizarDivision(Scanner scanner) {
//        System.out.print("Ingrese el primer número: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Ingrese el segundo número: ");
//        double num2 = scanner.nextDouble();
//        if (num2 != 0) {
//            System.out.println("Resultado: " + (num1 / num2));
//        } else {
//            System.out.println("Error: División por cero no permitida.");
//        }
//    }




    //--------------------------------------------------------Ejercicio 11 y 12----------------------------------------------------------------------
    public static void mostrarMenu() {
        System.out.println("\nMenú de Gestión de Bolera:");
        System.out.println("1. Entrada de datos");
        System.out.println("2. Capacidad disponible");
        System.out.println("3. Dinero recaudado");
        System.out.println("4. Cerrar sesión");
        System.out.print("Elija una opción: ");
    }

    public static void entradaDeDatos(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (edad < 21) {
            System.out.println("Lo siento, solo se permite el ingreso a mayores de 21 años.");
            return;
        }

        System.out.print("Ingrese su DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.print("¿Tiene un pase VIP o con descuento? (vip/descuento/ninguno): ");
        String tipoPase = scanner.nextLine().toLowerCase();

        double precioEntrada = PRECIO_ENTRADA_NORMAL;
        boolean esVIP = false;

        switch (tipoPase) {
            case "vip":
                esVIP = true;
                precioEntrada = 0;
                break;
            case "descuento":
                precioEntrada = PRECIO_ENTRADA_NORMAL / 2;
                break;
            default:
                System.out.print("¿Desea comprar una entrada normal o VIP? (normal/vip): ");
                String tipoEntrada = scanner.nextLine().toLowerCase();
                if (tipoEntrada.equals("vip")) {
                    esVIP = true;
                    precioEntrada = PRECIO_ENTRADA_VIP;
                }
                break;
        }

        if (capacidadActual >= CAPACIDAD_MAXIMA) {
            System.out.println("No hay suficiente capacidad disponible.");
            return;
        }

        capacidadActual++;
        dineroRecaudado += precioEntrada;

        System.out.println("Bienvenido, " + nombre + "!");
        if (esVIP) {
            System.out.println("Disfruta de tu entrada VIP.");
        }
    }

    public static void mostrarCapacidadDisponible() {
        int capacidadDisponible = CAPACIDAD_MAXIMA - capacidadActual;
        System.out.println("Capacidad disponible: " + capacidadDisponible + " personas.");
    }

    public static void mostrarDineroRecaudado() {
        System.out.println("Dinero recaudado: " + dineroRecaudado + " unidades.");
    }




}
