package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;

public class CheeseExtra extends Extra {
    private Double CHEESE_PRICE;

    public CheeseExtra(){
        CHEESE_PRICE = Prices.extras.get(CHEESE);
    }

    @Override
    public void sumExtras(Comanda order) {
        order.updateTotal(CHEESE_PRICE);
    }
}
