package org.victor.cabello.dev.domain.entity;

import java.time.Instant;

public abstract class TimestampedEntity extends Entity {

    private final Instant createdOn;
    private final Instant updatedOn;

    public TimestampedEntity() {
        //TODO create clock bean
        super();
        this.createdOn = Instant.now();
        this.updatedOn = Instant.now();
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }
}
