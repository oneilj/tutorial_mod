package com.jennyo.tutorial.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class SapphireOre extends OreBlock {
    public SapphireOre() {
        super(OreBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.BAMBOO)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch){
        if (fortune > 3){
            return 2;
        }
        if (silktouch == 0){
            return 0;
        }
        return 1;
    }
}
