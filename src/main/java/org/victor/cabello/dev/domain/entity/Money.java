package org.victor.cabello.dev.domain.entity;

public class Money {

    private final Currency currency;
    private final double quantity;

    public Money(Currency currency, double quantity) {
        this.currency = currency;
        this.quantity = quantity;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getQuantity() {
        return quantity;
    }
}
