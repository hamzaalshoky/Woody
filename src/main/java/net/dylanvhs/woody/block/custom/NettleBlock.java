package net.dylanvhs.woody.block.custom;

import net.dylanvhs.woody.item.ModItems;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CarrotBlock;

public class NettleBlock extends CarrotBlock {

    public NettleBlock(Properties p_51328_) {
        super(p_51328_);
    }

    protected ItemLike getBaseSeedId() {
        return ModItems.NETTLE_LEAVES.get();
    }
}
