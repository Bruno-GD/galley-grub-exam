package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extra {
    private Double SIZE_PRICE;

    public SizeLargeExtra() {
        SIZE_PRICE = Prices.extras.get(SIZE_LARGE);
    }

    @Override
    public void sumExtras(Comanda order) {
        order.updateTotal(SIZE_PRICE);
    }
}
