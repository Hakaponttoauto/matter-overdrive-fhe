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

package matteroverdrive.items.tools;

import matteroverdrive.Reference;
import matteroverdrive.api.internal.ItemModelProvider;
import matteroverdrive.client.ClientUtil;
import matteroverdrive.init.MatterOverdriveItems;
import net.minecraft.item.ItemAxe;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Simeon on 11/1/2015.
 */
public class TritaniumAxe extends ItemAxe implements ItemModelProvider {
    public TritaniumAxe(String name) {
        super(MatterOverdriveItems.TOOL_MATERIAL_TRITANIUM, MatterOverdriveItems.TOOL_MATERIAL_TRITANIUM.getAttackDamage(), -3.1f);
        setTranslationKey(Reference.MOD_ID + "." + name);
        setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
    }

    @Override
    public void initItemModel() {
        ClientUtil.registerModel(this, this.getRegistryName().toString());
    }

}
