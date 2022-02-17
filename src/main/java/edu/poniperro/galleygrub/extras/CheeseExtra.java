package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

public class CheeseExtra extends Extra {
    private Double CHEESE_PRICE;

    public CheeseExtra(){
        CHEESE_PRICE = Prices.extras.get(CHEESE);
    }

    @Override
    public void sumExtras(Comanda order) {
        double cheeseSum = order.itemList().stream()
                        .filter(item -> !item.isRegular() && item.extra().equals(CHEESE))
                        .mapToDouble(item -> CHEESE_PRICE)
                        .sum();
        order.updateTotal(cheeseSum);
        nextExtra.ifPresent(extra -> extra.sumExtras(order));
    }
}
