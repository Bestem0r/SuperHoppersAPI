/*
 * Copyright (c) 2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers.menu;

import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;

import java.util.List;

public class StorageHolder<E> {

    private StorageHolder() {}

    public void update() {}

    public void open(Player player) {
        open(player, 0);
    }

    public void open(Player player, int page) {}

    public int getPages() {
        return 0;
    }

    public List<HumanEntity> getViewers() {
        return null;
    }
}
