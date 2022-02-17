package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Order;
import edu.poniperro.galleygrub.receipt.Receipt;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheeseExtraTest {
    static Receipt receipt;
    static Extra cheese;
    static Order order;

    @Test
    public void sum_extras_cheese_test() {
        Prices.init_prices();

        order = new Order();

        order.addItem("Krabby Patty", 1.25, "cheese");
        order.addItem("Coral Bits", 1.00, "medium");
        order.addItem("Kelp Rings", 1.50, "sauce");
        order.addItem("Golden Loaf", 2.00, "sauce");
        order.addItem("Seafoam Soda", 1.00, "large");

        receipt = new Receipt(order);

        cheese = new CheeseExtra();
        receipt.setChain(cheese);

        cheese.sumExtras(order);
        assertEquals(0.25d, order.getTotal(), 0.1d);
    }
}