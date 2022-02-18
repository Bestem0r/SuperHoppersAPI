/*
 * Copyright (c) 2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers;

public class SuperHopperAPI {

    private static HopperManager hopperManager;

    protected static void setHopperManager(HopperManager hopperManager) {
        SuperHopperAPI.hopperManager = hopperManager;
    }

    public static HopperManager getHopperManager() {
        return hopperManager;
    }
}
