package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

public class Regular extends Extra {
    @Override
    public void sumExtras(Comanda order) {
        double regularSum = order.itemList().stream()
                        .filter(Item::isRegular)
                        .mapToDouble(Item::price)
                        .sum();
        order.updateTotal(regularSum);
        nextExtra.ifPresent(extra -> extra.sumExtras(order));
    }
}
