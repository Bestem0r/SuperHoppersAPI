/*
 * Copyright (c) 2021-2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers.utils;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

import java.util.Base64;

public class HopperLocation extends Location {

    private final World world;
    private final Location location;

    public HopperLocation(Location location) {
        super(location.getWorld(), location.getX(), location.getY(), location.getZ());

        this.location = location;
        this.world = location.getWorld();
    }

    /** Static factory to create HopperLocation from base64 */
    public static HopperLocation fromBase64(String base64) {
        String decoded = new String(Base64.getDecoder().decode(base64));
        String[] split = decoded.split("%");
        World world = Bukkit.getWorld(split[0]);

        int x = Integer.parseInt(split[1]);
        int y = Integer.parseInt(split[2]);
        int z = Integer.parseInt(split[3]);
        return new HopperLocation(new Location(world, x, y, z));
    }

    /** Returns encoded base64 string */
    public String toBase64() {
        String id = getWorld().getName() + "%" + getBlockX() + "%" + getBlockY() + "%" + getBlockZ();
        return Base64.getEncoder().encodeToString(id.getBytes());
    }

    /** Checks if this HopperLocation is located inside specified Chunk */
    public boolean isInChunk(Chunk chunk) {
        if (!chunk.isLoaded()) {
            return false;
        }
        int x = this.location.getChunk().getX();
        int z = this.location.getChunk().getZ();
        return (chunk.getWorld().getName().equals(world.getName()) && x == chunk.getX() && z == chunk.getZ());
    }
}
