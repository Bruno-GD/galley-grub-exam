package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

public class SauceExtra extends Extra {
    private Double SAUCE_PRICE;

    public SauceExtra() {
        SAUCE_PRICE = Prices.extras.get(SAUCE);
    }

    @Override
    public void sumExtras(Comanda order) {
        double sauceSum = order.itemList().stream()
                .filter(item -> !item.isRegular() && item.extra().equals(SAUCE))
                .mapToDouble(item -> SAUCE_PRICE)
                .sum();
        order.updateTotal(sauceSum);
        nextExtra.ifPresent(extra -> extra.sumExtras(order));
    }
}
