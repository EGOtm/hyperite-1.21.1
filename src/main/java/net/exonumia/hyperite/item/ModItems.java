package net.exonumia.hyperite.item;

import net.exonumia.hyperite.hyperite;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(hyperite.MOD_ID);

    public static final DeferredItem<Item> RAW_HYPERITE = ITEMS.register("raw_hyperite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> HYPERITE_INGOT = ITEMS.register("hyperite_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
