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

    public static final RegistryObject<Item> ICON = ITEMS.register("icon",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> ADULTPAW = ITEMS.register("adultpaw",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> YOUTHPAW = ITEMS.register("youthpaw",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> ELDERPAW = ITEMS.register("elderpaw",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> KITTENPAW = ITEMS.register("kittenpaw",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> ADULTCLAW = ITEMS.register("adultclaw",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> YOUTHCLAW = ITEMS.register("youthclaw",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> ELDERCLAW = ITEMS.register("elderclaw",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> KITTENCLAW = ITEMS.register("kittenclaw",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> ADULTNOSE = ITEMS.register("adultnose",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> YOUTHNOSE = ITEMS.register("youthnose",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> ELDERNOSE = ITEMS.register("eldernose",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> KITTENNOSE = ITEMS.register("kittennose",
            () -> new Item(new Item.Properties()) );

    public static final RegistryObject<Item> GOLDENEAGLEFEATHER = ITEMS.register("goldeneaglefeather",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> BALDEAGLEFEATHER = ITEMS.register("baldeaglefeather",
            () -> new Item(new Item.Properties()) );
    public static final RegistryObject<Item> WHITETAILEDEAGLEFEATHER = ITEMS.register("whitetailedeaglefeather",
            () -> new Item(new Item.Properties()) );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
