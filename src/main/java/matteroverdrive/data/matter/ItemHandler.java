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

package matteroverdrive.data.matter;

import net.minecraft.item.ItemStack;

/**
 * Created by Simeon on 1/17/2016.
 */
public class ItemHandler extends MatterEntryHandlerAbstract<ItemStack> {
    private final int matter;
    private final boolean finalHandle;

    public ItemHandler(int matter) {
        this.matter = matter;
        this.finalHandle = false;
    }

    public ItemHandler(int matter, boolean finalHandle) {
        this.matter = matter;
        this.finalHandle = finalHandle;
    }

    public ItemHandler(int matter, boolean finalHandle, int priority) {
        this.priority = priority;
        this.matter = matter;
        this.finalHandle = finalHandle;
    }

    @Override
    public int modifyMatter(ItemStack itemStack, int originalMatter) {
        return matter;
    }

    @Override
    public boolean finalModification(ItemStack itemStack) {
        return finalHandle;
    }
}
