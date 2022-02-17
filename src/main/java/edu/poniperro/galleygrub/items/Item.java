package edu.poniperro.galleygrub.items;

import java.util.Objects;

public class Item implements Product {
    private final String name;
    private final Double price;
    private String extra = null;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
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
        return extra;
    }

    @Override
    public boolean isRegular() {
        return extra() == null;
    }

    @Override
    public String toString() {
        return isRegular() ?
                String.format("%s....%.2f$", name, price) :
                String.format("%s w/ %s....%.2f$ + %.2f$", name, extra, price, Prices.extras.get(extra));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
