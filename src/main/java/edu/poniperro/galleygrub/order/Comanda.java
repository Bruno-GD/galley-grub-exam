package edu.poniperro.galleygrub.order;

import edu.poniperro.galleygrub.items.Item;

import java.util.List;

public interface Comanda {
    void addItem(String name, Double price);
    void addItem(String name, Double price, String extra);
    int size();
    List<Item> itemList();
    double getTotal();
    void updateTotal(Double price);
    void display();
}
