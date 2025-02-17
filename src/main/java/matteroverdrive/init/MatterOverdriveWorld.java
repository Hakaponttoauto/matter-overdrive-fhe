/*
 * This file is part of MatterOverdrive: Legacy Edition
 * Copyright (C) 2019, Horizon Studio <contact@hrznstudio.com>, All rights reserved.
 *
 * MatterOverdrive: Legacy Edition is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MatterOverdrive: Legacy Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Matter Overdrive.  If not, see <http://www.gnu.org/licenses>.
 */

package matteroverdrive.init;

import matteroverdrive.handler.ConfigurationHandler;
import matteroverdrive.world.DimensionalRifts;
import matteroverdrive.world.MOWorldGen;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class MatterOverdriveWorld {
    public final MOWorldGen worldGen;
    private final DimensionalRifts dimensionalRifts;

    public MatterOverdriveWorld(ConfigurationHandler configurationHandler) {
        worldGen = new MOWorldGen();
        dimensionalRifts = new DimensionalRifts(0.013f);
        configurationHandler.subscribe(worldGen);
    }

    public void init(ConfigurationHandler configurationHandler) {
        worldGen.init(configurationHandler);
        GameRegistry.registerWorldGenerator(worldGen, 0);
    }

    public void onWorldTick(TickEvent.WorldTickEvent event) {
        if (event.side.equals(Side.SERVER)) {
            worldGen.manageBuildingGeneration();
        }
    }

    public DimensionalRifts getDimensionalRifts() {
        return dimensionalRifts;
    }
}
