/*
 * Copyright (c) 2021-2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers.stored;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import java.math.BigDecimal;

public class StoredMob implements Stored<EntityType> {

    @Override
    public BigDecimal getWorth() {
        return null;
    }

    @Override
    public void setAmount(int amount) {}

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public ItemStack asItem() {
        return null;
    }

    @Override
    public EntityType getType() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

}
