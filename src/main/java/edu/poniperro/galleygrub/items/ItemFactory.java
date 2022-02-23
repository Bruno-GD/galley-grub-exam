package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ItemFactory {
    private static final Map<Integer, Item> itemMap = new HashMap<>();

    public static Item getItem(String name, Double price) {
        final Integer hashName = Objects.hash(name);
        if (itemMap.containsKey(hashName))
            return itemMap.get(hashName);
        else {
            final Item item = new Item(name, price);
            itemMap.put(hashName, item);
            return item;
        }
    }

    public static Item getItem(String name, Double price, String extra) {
        final Integer hashName = Objects.hash(name, extra);
        if (itemMap.containsKey(hashName))
            return itemMap.get(hashName);
        else {
            final Item item = new Item(name, price, extra);
            itemMap.put(hashName, item);
            return item;
        }
    }

}
