package edu.poniperro.galleygrub.order;

import edu.poniperro.galleygrub.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda {
    private Double total;
    private final List<Item> items = new ArrayList<Item>();

    public Order(){}

    @Override
    public void addItem(String name, Double price) {
        items.add(new Item(name, price));
    }

    @Override
    public void addItem(String name, Double price, String extra) {
        // TODO
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public List<Item> itemList() {
        return items;
    }

    @Override
    public double getTotal() {
        return total;
    }

    @Override
    public void updateTotal() {
        // TODO
    }

    @Override
    public void display() {
        System.out.println("\t--- ORDER ---\n");
        items.forEach(item -> System.out.println("\t" + item.toString()));
    }
}
