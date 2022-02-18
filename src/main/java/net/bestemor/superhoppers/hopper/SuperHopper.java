/*
 * Copyright (c) 2021-2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers.hopper;

import net.bestemor.superhoppers.SHPlugin;
import net.bestemor.superhoppers.menu.StorageHolder;
import net.bestemor.superhoppers.stored.Stored;
import net.bestemor.superhoppers.utils.HopperLocation;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

public abstract class SuperHopper<E> {


    public SuperHopper(SHPlugin plugin, File file, List<String> hologramLines) {
    }

    /** Abstract methods implemented by sub-classes */
    protected abstract void loadStorage();
    public abstract void sell(Player player, Stored<E> stored, int amount);
    public abstract boolean withdraw(Player player, Stored<E> stored, int amount);
    protected abstract void openInventory(Player player);
    public abstract ItemStack asItemStack();
    public abstract void store(E type, int amount);

    public void createHologram() {}


    /** Returns total worth of all items in storage */
    public BigDecimal getTotalWorth() {
        return null;
    }

    public void updateHologram() {
    }
    public void removeHologram() {
    }

    /** Updates storage menu if there are any viewers */
    public void updateStorageIfView() {
    }

    public boolean isOwner(Player player) {
        return false;
    }

    /** Adds target to trusted list */
    public void addTrusted(Player executor, Player target) {}

    public void removeTrusted(Player executor, Player target) {}

    /** Toggles trustAll if player is owner */
    public void toggleTrustAll(Player player) {}

    /** Sell everything in hopper **/
    public void sellAll() {}

    public HopperLocation getChunkLocation() {
        return null;
    }
    public List<Stored<E>> getStorage() {
        return null;
    }

    public boolean isAutoSell() {
        return false;
    }

    public boolean isQuickSellAll() {
        return false;
    }

    public boolean isTrustAll() {
        return false;
    }
    
    public void toggleQuickSell() {}
    
    public void toggleAutoSell() {}

    public StorageHolder<E> getStorageHolder() {
        return null;
    }

    /** Save method **/
    public void save() {}

    /** Deletes SuperHoppers from file and memory */
    public void delete() {}
}
