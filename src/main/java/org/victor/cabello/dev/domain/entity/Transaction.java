package org.victor.cabello.dev.domain.entity;

import java.time.Instant;
import java.util.Set;

public class Transaction extends TimestampedEntity{

    private final Instant occurredOn;
    private final Set<TransactionTag> tags;

    public Transaction(Instant occurredOn, Set<TransactionTag> tags) {
        super();
        this.occurredOn = occurredOn;
        this.tags = tags;
    }

    public Instant getOccurredOn() {
        return occurredOn;
    }

    public Set<TransactionTag> getTags() {
        return tags;
    }
}
