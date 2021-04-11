package org.victor.cabello.dev.domain.entity;

public class Account {

    private final String name;
    private final String description;
    private final TransactionHistory transactionHistory;
    private final Money money;
    private final Currency defaultCurrency;
    private final AccountType accountType;

    public Account(String name,
                   String description,
                   TransactionHistory transactionHistory,
                   Money money,
                   Currency defaultCurrency,
                   AccountType accountType
    ) {
        this.name = name;
        this.description = description;
        this.transactionHistory = transactionHistory;
        this.money = money;
        this.defaultCurrency = defaultCurrency;
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }

    public Money getMoney() {
        return money;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}
