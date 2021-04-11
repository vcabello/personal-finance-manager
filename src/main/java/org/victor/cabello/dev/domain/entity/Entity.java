package org.victor.cabello.dev.domain.entity;

import java.util.UUID;

public abstract class Entity {

    private UUID uuid;

    public Entity() {
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }
}
