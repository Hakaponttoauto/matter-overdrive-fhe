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

package matteroverdrive.data.inventory;

import matteroverdrive.MatterOverdrive;
import matteroverdrive.client.render.HoloIcon;
import matteroverdrive.proxy.ClientProxy;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Simeon on 8/5/2015.
 */
public class TeleportFlashDriveSlot extends Slot {
    public TeleportFlashDriveSlot(boolean isMainSlot) {
        super(isMainSlot);
    }

    public boolean isValidForSlot(ItemStack item) {
        return item != null && item.getItem() == MatterOverdrive.ITEMS.transportFlashDrive;
    }

    @SideOnly(Side.CLIENT)
    public HoloIcon getHoloIcon() {
        return ClientProxy.holoIcons.getIcon("flash_drive");
    }

    @Override
    public String getUnlocalizedTooltip() {
        return "item.transport_flash_drive.name";
    }
}
