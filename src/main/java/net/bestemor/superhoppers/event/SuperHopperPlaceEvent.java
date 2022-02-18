/*
 * Copyright (c) 2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers.event;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class SuperHopperPlaceEvent extends PlayerEvent implements Cancellable {

    private final Block block;

    private boolean cancelled;
    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public SuperHopperPlaceEvent(Player who, Block block) {
        super(who);
        this.block = block;
    }


    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    public Block getBlock() {
        return block;
    }
}
