package edu.poniperro.galleygrub.items;

public interface Product {
    String name();
    double price();
    Prices extra();
    boolean isRegular();
}
