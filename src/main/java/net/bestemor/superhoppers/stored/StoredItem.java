/*
 * Copyright (c) 2021-2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers.stored;

import org.bukkit.inventory.ItemStack;

import java.math.BigDecimal;

public class StoredItem implements Stored<SimpleItem> {

    private StoredItem() {}

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
    public SimpleItem getType() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
