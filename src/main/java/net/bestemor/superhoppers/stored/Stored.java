/*
 * Copyright (c) 2021-2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers.stored;

import org.bukkit.inventory.ItemStack;

import java.math.BigDecimal;

public interface Stored<T> {
    
    BigDecimal getWorth();
    
    void setAmount(int amount);

    int getAmount();

    ItemStack asItem();

    T getType();

    @Override
    String toString();
}
