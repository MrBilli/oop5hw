package org.example;

import org.example.CONTROLLER.Controller;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createCoffe("cappuccino", 0.33, 36.6);
        controller.createCoffe("frappuccino", 0.4, 36.6);
        controller.createCoffe("espresso", 0.1, 40);
        controller.showCoffesInMachine();
        var cappuccino = controller.getCoffe("cappuccino", 0.33, 36.6);
        System.out.println(cappuccino);
    }
}