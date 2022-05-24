package net.dylanvhs.woody.item;

import net.dylanvhs.woody.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab WOODY_TAB    = new CreativeModeTab("woodytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.MAPLE_PLANKS.get());
        }
    };
}
