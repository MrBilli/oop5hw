package org.example.MODEL;

import java.util.ArrayList;

public class CoffeVendingMachine implements Vending {

    protected ArrayList<Coffe> hotDrinks = new ArrayList<Coffe>();

    public CoffeVendingMachine() {

    }

   @Override
    public void addProduct(Coffe coffe) {
hotDrinks.add(coffe);
    }

    @Override
    public Coffe getProduct(String name, double volume, double temperature) {
        for (int i = 0; i < this.hotDrinks.size(); i++) {
            if (this.hotDrinks.get(i).name == name && this.hotDrinks.get(i).volume == volume && this.hotDrinks.get(i).tempreture == temperature)
                return this.hotDrinks.get(i);
        }
        return null;
    }

    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < this.hotDrinks.size(); i++) {
            str += this.hotDrinks.get(i).getName() + " vol " + this.hotDrinks.get(i).getVolume() + " temp " + this.hotDrinks.get(i).getTempreture() + "\n";
        }
        return "Coffes in authomat:\n" + str;
    }
}
