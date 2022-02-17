package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class Prices {
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
}
