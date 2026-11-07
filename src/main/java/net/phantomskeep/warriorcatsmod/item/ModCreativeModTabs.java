package net.phantomskeep.warriorcatsmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.phantomskeep.warriorcatsmod.WarriorCatsMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WarriorCatsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WARRIORCATS_TAB = CREATIVE_MODE_TABS.register("warriorcats_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ICON.get()))
                    .title(Component.translatable("creativetab.warriorcats_tab"))
                    .displayItems((pParameters, pOutput) -> {
                      pOutput.accept(ModItems.ADULTPAW.get());
                      pOutput.accept(ModItems.YOUTHPAW.get());
                    })
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
