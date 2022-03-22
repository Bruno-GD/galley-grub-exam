package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.*;
import edu.poniperro.galleygrub.items.Prices;
import edu.poniperro.galleygrub.order.Comanda;
import edu.poniperro.galleygrub.order.Order;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptTest {
    Receipt receipt;
    Order order;
    Extra cheese;

    @BeforeEach
    public void setup_receipt() {
        // Prices.init_prices();

        order = new Order();

        order.addItem("Krabby Patty", 1.25, Prices.CHEESE);
        order.addItem("Coral Bits", 1.00, Prices.MEDIUM); // si definir medium
        order.addItem("Kelp Rings", 1.50, Prices.SAUCE);
        order.addItem("Golden Loaf", 2.00, Prices.SAUCE);
        order.addItem("Seafoam Soda", 1.00, Prices.LARGE);
        order.addItem("Coral Bits", 1.00, Prices.LARGE);

        receipt = new Receipt(order);
    }

    // integracion receipt con un Extra
    @Test
    public void sum_extra_cheese_test() {

        cheese = new CheeseExtra();
        receipt.setChain(cheese);
        assertNotNull(receipt.getChain());

        Comanda savedOrder = receipt.getOrder();
        assertNotNull(savedOrder);
        assertEquals(0d, savedOrder.getTotal(), 0d);

        receipt.sumExtrasCharge();
        assertEquals(0.25d, receipt.getOrder().getTotal(), 0d);
    }

    // integracion receipt con tres Extra
    @Test
    public void chain_test() {

        cheese = new CheeseExtra();
        Extra sauce = new SauceExtra();
        Extra size = new SizeLargeExtra();

        cheese.setNextExtra(sauce);
        sauce.setNextExtra(size);

        receipt.setChain(cheese);
        assertNotNull(receipt.getChain());

        receipt.sumExtrasCharge();
        assertEquals(2.25d, receipt.getOrder().getTotal(), 0d);
    }

    // Total con regular y extras
    @Test
    public void total_w_extra_test() {

        cheese = new CheeseExtra();
        Extra sauce = new SauceExtra();
        Extra size = new SizeLargeExtra();

        Regular regular = new Regular();
        regular.setNextExtra(cheese);
        cheese.setNextExtra(sauce);
        sauce.setNextExtra(size);

        receipt.setChain(regular);
        assertNotNull(receipt.getChain());

        assertEquals(10.0d , receipt.total(), 0.1);
    }
}