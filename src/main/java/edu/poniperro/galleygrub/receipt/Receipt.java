package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {
    private Double total = 0d;
    private final Comanda order;

    public Receipt(Comanda order) {
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return order;
    }

    @Override
    public double total() {
        order.updateTotal();
        total = order.getTotal();
        return total;
    }

    @Override
    public void sumExtrasCharge() {
        // TODO
    }

    @Override
    public void print() {
        order.display();
        System.out.printf("\tTOTAL --------> %.2f$\n", total);
    }
}
