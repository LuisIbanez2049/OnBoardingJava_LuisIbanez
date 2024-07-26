package day_4.models;

import day_4.interfaces.CalculatorMenu;
import day_4.interfaces.implement.CalculatorMenuImplement;

public class Calculadora {
    private CalculatorMenu menu = new CalculatorMenuImplement();


    public CalculatorMenu getMenu() {
        return menu;
    }
}
