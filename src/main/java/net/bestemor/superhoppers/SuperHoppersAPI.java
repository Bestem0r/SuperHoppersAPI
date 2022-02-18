/*
 * Copyright (c) 2022. Vebjørn Viem Elvekrok
 * All rights reserved.
 */

package net.bestemor.superhoppers;

public class SuperHoppersAPI {

    private static HopperManager hopperManager;

    protected static void setHopperManager(HopperManager hopperManager) {
        SuperHoppersAPI.hopperManager = hopperManager;
    }

    public static HopperManager getHopperManager() {
        return hopperManager;
    }
}
