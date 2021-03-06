package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extra {
    private Double SIZE_PRICE;

    public SizeLargeExtra() {
        SIZE_PRICE = Prices.LARGE.getPrice();
    }

    @Override
    public void sumExtras(Comanda order) {
        double sizeLargeSum = order.itemList().stream()
                .filter(item -> !item.isRegular() && item.extra() == Prices.LARGE)
                .mapToDouble(item -> SIZE_PRICE)
                .sum();
        order.updateTotal(sizeLargeSum);
        nextExtra.ifPresent(extra -> extra.sumExtras(order));
    }
}
