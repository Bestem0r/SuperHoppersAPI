/*
 * Copyright (c) 2021-2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers.hopper;

import net.bestemor.superhoppers.SHPlugin;
import net.bestemor.superhoppers.stored.Stored;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.io.File;

public class MobHopper extends SuperHopper<EntityType> {


    public MobHopper(SHPlugin plugin, File file) {
        super(plugin, file, null);
    }

    @Override
    public void loadStorage() {}

    @Override
    public boolean withdraw(Player player, Stored<EntityType> stored, int amount) {return false;}

    @Override
    public void sell(Player player, Stored<EntityType> stored, int amount) {}

    @Override
    protected void openInventory(Player player) {}

    @Override
    public ItemStack asItemStack() {
        return null;
    }

    @Override
    public void store(EntityType entityType, int amount) {}
}
