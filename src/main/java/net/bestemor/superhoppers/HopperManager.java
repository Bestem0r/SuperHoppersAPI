/*
 * Copyright (c) 2021-2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers;

import net.bestemor.superhoppers.hopper.ItemHopper;
import net.bestemor.superhoppers.hopper.MobHopper;
import net.bestemor.superhoppers.hopper.SuperHopper;
import net.bestemor.superhoppers.utils.HopperLocation;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class HopperManager {

    public HopperManager(SHPlugin plugin) {
    }

    public void updateHolograms() {}

    /** Saves hoppers */
    public void save() {}


    /** Reloads hopper data */
    public void reload() {}


    /** Creates new Hopper Configuration with default values */
    public void create(Location location, String type, Player owner, String filter, String name) {}

    /** Adds hopper to hopper list */
    private void addHopper(File file) {}

    /** Removes hopper from the list */
    public void removeHopper(SuperHopper<?> superHopper) {}

    /** Returns hopper from location */
    public SuperHopper<?> getFromLocation(Location location) { return null; }

    /** Returns list of SuperHoppers found in specified chunk */
    public List<SuperHopper<?>> getFromChunk(Chunk chunk) { return null; }
    
}
