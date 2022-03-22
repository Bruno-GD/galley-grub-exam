package edu.poniperro.galleygrub.items;

import java.util.EnumSet;

public enum Prices {
    CHEESE(0.25d), SAUCE(0.50d), MEDIUM(0.25d), LARGE(0.50d);

    private final double price;

    Prices(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s=%.2f$", this.name(), this.price);
    }

    public static void display() {
        EnumSet.allOf(Prices.class)
                .forEach(System.out::println);
    }

    /*
    public static final Map<String, Double> extras = new HashMap<>();

    public static void init_prices() {
        extras.put("cheese", 0.25d);
        extras.put("sauce", 0.50d);
        extras.put("medium", 0.25d);
        extras.put("large", 0.50d);
    }

    public static void display() {
        extras.forEach((key, value) -> System.out.printf("%s=%.2f$\n", key, value));
    }
     */
}
