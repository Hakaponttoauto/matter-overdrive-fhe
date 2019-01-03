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

package matteroverdrive.blocks;

import matteroverdrive.MatterOverdrive;
import matteroverdrive.blocks.includes.IImageGenBlock;
import matteroverdrive.blocks.includes.MOBlock;
import matteroverdrive.util.MOBlockHelper;
import matteroverdrive.world.MOImageGen;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simeon on 10/6/2015.
 *
 * @since 0.4.0
 */
public class BlockDecorative extends MOBlock implements IImageGenBlock {

    public static final List<BlockDecorative> decorativeBlocks = new ArrayList<>();
    private int mapColor;

    public BlockDecorative(Material material, String name, float hardness, int harvestLevel, float resistance, int mapColor) {
        super(material, name);
        setHardness(hardness);
        setHarvestLevel("pickaxe", harvestLevel);
        setResistance(resistance);
        setCreativeTab(MatterOverdrive.TAB_OVERDRIVE);
        this.mapColor = mapColor;
        decorativeBlocks.add(this);
        MOImageGen.worldGenerationBlockColors.put(this, getBlockColor(0));
        setRotationType(MOBlockHelper.RotationType.PREVENT);
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        worldIn.setBlockState(pos, state.withProperty(MOBlock.PROPERTY_DIRECTION, EnumFacing.VALUES[stack.getItemDamage()]));
    }

    @Override
    public int getBlockColor(int meta) {
        return mapColor;
    }
}