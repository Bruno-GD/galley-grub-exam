package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.order.Comanda;

public interface Ticket {
    Comanda getOrder();
    //void setChain(Extra extra); // TODO Extra
    //Extra getChain(); // TODO Extra
    double total();
    void sumExtrasCharge();
    void print();
}
