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

package matteroverdrive.api.events;

import matteroverdrive.api.matter.IMatterEntry;
import net.minecraftforge.fml.common.eventhandler.Event;

/**
 * Created by Simeon on 7/21/2015.
 * Triggered when registering matter entries in the Matter Registry.
 * When canceled, the entry will not be registered.
 * This is a good in-game way to remove matter for items, even when the configs have custom values.
 */
public class MOEventRegisterMatterEntry extends Event {
    /**
     * The matter entry being registered.
     */
    public final IMatterEntry entry;

    public MOEventRegisterMatterEntry(IMatterEntry entry) {
        this.entry = entry;
    }

    @Override
    public boolean isCancelable() {
        return true;
    }
}
