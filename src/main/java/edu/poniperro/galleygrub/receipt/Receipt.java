package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {
    private Double total = 0d;
    private final Comanda order;
    private Extra firstExtra = null;

    public Receipt(Comanda order) {
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return order;
    }

    @Override
    public void setChain(Extra extra) {
        firstExtra = extra;
    }

    @Override
    public Extra getChain() {
        return firstExtra;
    }

    @Override
    public double total() {
        if (getChain() != null) sumExtrasCharge();
        return order.getTotal();
    }

    @Override
    public void sumExtrasCharge() {
        getChain().sumExtras(order);
    }

    @Override
    public void print() {
        order.display();
        System.out.printf("\tTOTAL --------> %.2f$\n", order.getTotal());
    }
}
