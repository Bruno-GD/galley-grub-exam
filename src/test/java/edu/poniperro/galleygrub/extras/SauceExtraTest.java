package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Order;
import edu.poniperro.galleygrub.receipt.Receipt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SauceExtraTest {
    static Receipt receipt;
    static Extra sauce;
    static Order order;

    @Test
    public void sum_extras_cheese_test() {
        // Prices.init_prices();

        order = new Order();

        order.addItem("Krabby Patty", 1.25, Prices.CHEESE);
        order.addItem("Coral Bits", 1.00, Prices.MEDIUM);
        order.addItem("Kelp Rings", 1.50, Prices.SAUCE);
        order.addItem("Golden Loaf", 2.00, Prices.SAUCE);
        order.addItem("Seafoam Soda", 1.00, Prices.LARGE);

        receipt = new Receipt(order);

        sauce = new SauceExtra();
        receipt.setChain(sauce);

        sauce.sumExtras(order);
        assertEquals(1.00d, order.getTotal(), 0.1d);
    }
}