package day_4;

import day_4.interfaces.CalculatorMenu;
import day_4.models.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){


        Scanner scanner = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();
        //calculadora.getMenu().mostrarMenu();
        calculadora.getMenu().ejecutarOperacionSeleccionada(scanner);
    }
}
