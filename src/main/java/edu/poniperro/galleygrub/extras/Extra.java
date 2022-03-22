package edu.poniperro.galleygrub.extras;

import edu.poniperro.galleygrub.order.Comanda;

import java.util.Optional;

public abstract class Extra {
    String extraProduct;
    Optional<Extra> nextExtra = Optional.empty();

    Extra() {}

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.ofNullable(nextExtra);
    }

    public abstract void sumExtras(Comanda order);
}
