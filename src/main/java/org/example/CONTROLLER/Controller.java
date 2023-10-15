package org.example.CONTROLLER;

import org.example.MODEL.Coffe;
import org.example.MODEL.CoffeVendingMachine;
import org.example.VIEV.Viev;

import java.util.ArrayList;

public class Controller {
    Viev viev = new Viev();
    CoffeVendingMachine coffeVendingMachine = new CoffeVendingMachine();

    public void createCoffe(String name, double volume, double temperature) {
        coffeVendingMachine.addProduct(new Coffe(name, volume, temperature));
    }

    public Coffe getCoffe(String name, double volume, double temperature) {
        return coffeVendingMachine.getProduct(name, volume, temperature);
    }

public void showCoffesInMachine(){
        viev.showCoffeVendingMachine(coffeVendingMachine);
}
}
