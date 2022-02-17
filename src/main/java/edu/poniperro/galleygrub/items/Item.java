package edu.poniperro.galleygrub.items;

public class Item implements Product {
    private final String name;
    private final Double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String extra() {
        return null;
    }

    @Override
    public boolean isRegular() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s....%.2f$", name, price);
    }
}
