package edu.poniperro.galleygrub.order;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.Prices;

import java.util.List;

public interface Comanda {
    void addItem(String name, Double price);
    void addItem(String name, Double price, Prices extra);
    int size();
    List<Item> itemList();
    double getTotal();
    void updateTotal(Double price);
    void display();
}
