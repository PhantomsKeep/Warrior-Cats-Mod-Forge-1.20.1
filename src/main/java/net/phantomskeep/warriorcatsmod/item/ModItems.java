package net.phantomskeep.warriorcatsmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phantomskeep.warriorcatsmod.WarriorCatsMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WarriorCatsMod.MOD_ID);

    public static final RegistryObject<Item> ADULTPAW = ITEMS.register("adultpaw",
            () -> new Item(new Item.Properties()) );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
