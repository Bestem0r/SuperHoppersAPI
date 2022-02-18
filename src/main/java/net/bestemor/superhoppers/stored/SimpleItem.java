/*
 * Copyright (c) 2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers.stored;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class SimpleItem {

    private final Material material;
    private final short durability;

    public SimpleItem(Material material, short durability) {
        this.material = material;
        this.durability = durability;
    }

    public SimpleItem(String s) {
        if (s.contains(":")) {
            this.material = Material.valueOf(s.split(":")[0]);
            this.durability = (short) Integer.parseInt(s.split(":")[1]);
        } else {
            this.material = Material.valueOf(s);
            this.durability = 0;
        }
    }

    public SimpleItem(ItemStack i) {
        this.material = i.getType();
        this.durability = i.getDurability();
    }

    public ItemStack getItem() {
        return new ItemStack(material, 1, durability);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj instanceof SimpleItem) {

            SimpleItem i = (SimpleItem) obj;
            return i.material == this.material && i.durability == this.durability;

        }

        return false;
    }

    @Override
    public String toString() {
        return durability == 0 ? material.name() : material.name() + ":" + durability;
    }

    public Material getMaterial() {
        return material;
    }

    public SimpleItem clone() {
        return new SimpleItem(material, durability);
    }
}
