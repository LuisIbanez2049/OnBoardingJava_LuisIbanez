package day_4.interfaces.implement;

import day_4.interfaces.CalculatorOperations;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CalculatorOperationsImplement implements CalculatorOperations {
    @Override
    public void sumar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Resultado: " + (num1 + num2));
    }

    @Override
    public void restar(Scanner scanner) {
        System.out.println("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Resultado: " + (num1 - num2));
    }

    @Override
    public void multiplicar(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Resultado: " + (num1 * num2));
    }

    @Override
    public void dividir(Scanner scanner) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();
        if (num2 != 0) {
            System.out.println("Resultado: " + (num1 / num2));
        } else {
            System.out.println("Error: División por cero no permitida.");
        }
    }
}
