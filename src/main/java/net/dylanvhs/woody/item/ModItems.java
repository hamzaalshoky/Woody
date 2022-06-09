package net.dylanvhs.woody.item;

import net.dylanvhs.woody.WoodyMod;
import net.dylanvhs.woody.block.ModBlocks;
import net.dylanvhs.woody.entity.ModEntityTypes;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WoodyMod.MOD_ID);

    public static final RegistryObject<Item> MAPLE_SIGN_ITEM = ITEMS.register("maple_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTab.WOODY_TAB).stacksTo(16),
                    ModBlocks.MAPLE_SIGN.get(), ModBlocks.MAPLE_WALL_SIGN.get()));

    public static final RegistryObject<Item> SQUIRREL_SPAWN_EGG = ITEMS.register("squirrel_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SQUIRREL,13128459, 10825989,
                    new Item.Properties().tab(ModCreativeModeTab.WOODY_TAB)));

    public static final RegistryObject<Item> OWL_SPAWN_EGG = ITEMS.register("owl_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.OWL,11891254, 9918250,
                    new Item.Properties().tab(ModCreativeModeTab.WOODY_TAB)));

    public static final RegistryObject<Item> NETTLE_LEAVES = ITEMS.register("nettle_leaves",
            () -> new ItemNameBlockItem(ModBlocks.NETTLE_BLOCK.get(),
                    new Item.Properties().tab(ModCreativeModeTab.WOODY_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
