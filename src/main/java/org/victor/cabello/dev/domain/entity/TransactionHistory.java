package org.victor.cabello.dev.domain.entity;

import java.util.Set;

public class TransactionHistory {

    private final Set<Transaction> transactions;

    public TransactionHistory(Set<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }
}
