package day_4.interfaces.implement;

import day_4.interfaces.CalculatorMenu;
import day_4.interfaces.CalculatorOperations;

import java.util.Scanner;

public class CalculatorMenuImplement implements CalculatorMenu {

    private CalculatorOperations tipoDeOperacion;
    private Scanner scanner;
    private CalculatorOperations getTipoDeOperacion = new CalculatorOperationsImplement();
    @Override
    public void mostrarMenu() {
        System.out.println("\nMenú de Calculadora:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("0. Salir");
        System.out.print("Elija una opción: ");
    }

    @Override
    public void ejecutarOperacionSeleccionada(Scanner scanner) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    getTipoDeOperacion.sumar(scanner);
                    break;
                case 2:
                    getTipoDeOperacion.restar(scanner);
                    break;
                case 3:
                    getTipoDeOperacion.multiplicar(scanner);
                    break;
                case 4:
                    getTipoDeOperacion.dividir(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
            }
        }while (opcion != 0);
    }
}
