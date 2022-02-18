/*
 * Copyright (c) 2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers.event;

import net.bestemor.superhoppers.hopper.SuperHopper;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class SuperHopperBreakEvent extends PlayerEvent implements Cancellable {

    private final SuperHopper<?> hopper;
    private boolean cancelled;

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    public SuperHopperBreakEvent(Player who, SuperHopper<?> hopper) {
        super(who);
        this.hopper = hopper;
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


    public SuperHopper<?> getHopper() {
        return hopper;
    }
}
