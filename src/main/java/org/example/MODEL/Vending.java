package org.example.MODEL;

import java.util.ArrayList;

public interface Vending {




    HotDrink getProduct(String name, double volume, double temperature);

    void addProduct( Coffe coffe);
}
