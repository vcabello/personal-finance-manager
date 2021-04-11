package org.victor.cabello.dev.domain.entity;

import java.util.Set;

public class User {

    private String name;
    private String surname;
    private final Set<Account> accounts;

    public User(String name, String surname, Set<Account> accounts) {
        this.name = name;
        this.surname = surname;
        this.accounts = accounts;
    }
}
