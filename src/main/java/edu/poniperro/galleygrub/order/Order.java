package edu.poniperro.galleygrub.order;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.ItemFactory;
import edu.poniperro.galleygrub.items.Prices;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda {
    private Double total = 0d;
    private final List<Item> items = new ArrayList<Item>();

    public Order(){}

    @Override
    public void addItem(String name, Double price) {
        items.add(ItemFactory.getItem(name, price));
    }

    @Override
    public void addItem(String name, Double price, Prices extra) {
        items.add(ItemFactory.getItem(name, price, extra));
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
    public void updateTotal(Double price) {
        total += price;
    }

    @Override
    public void display() {
        System.out.println("\t--- ORDER ---\n");
        items.forEach(item -> System.out.println("\t" + item.toString()));
    }
}
