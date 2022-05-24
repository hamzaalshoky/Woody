package net.dylanvhs.woody.item;

import net.dylanvhs.woody.WoodyMod;
import net.dylanvhs.woody.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WoodyMod.MOD_ID);

    public static final RegistryObject<Item> CHERRY_BLOSSOM_SIGN_ITEM = ITEMS.register("cherry_blossom_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTab.WOODY_TAB).stacksTo(16),
                    ModBlocks.MAPLE_SIGN.get(), ModBlocks.MAPLE_WALL_SIGN.get()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
