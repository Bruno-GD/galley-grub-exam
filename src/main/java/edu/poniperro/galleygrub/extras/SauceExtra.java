package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

public class SauceExtra extends Extra {
    private Double SAUCE_PRICE;

    public SauceExtra() {
        SAUCE_PRICE = Prices.extras.get(SAUCE);
    }

    @Override
    public void sumExtras(Comanda order) {
        order.updateTotal(SAUCE_PRICE);
    }
}
