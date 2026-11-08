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
                      pOutput.accept(ModItems.KITTENPAW.get());
                      pOutput.accept(ModItems.ELDERPAW.get());
                      pOutput.accept(ModItems.ADULTCLAW.get());
                      pOutput.accept(ModItems.YOUTHCLAW.get());
                      pOutput.accept(ModItems.KITTENCLAW.get());
                      pOutput.accept(ModItems.ELDERCLAW.get());
                      pOutput.accept(ModItems.ADULTNOSE.get());
                      pOutput.accept(ModItems.YOUTHNOSE.get());
                      pOutput.accept(ModItems.KITTENNOSE.get());
                      pOutput.accept(ModItems.ELDERNOSE.get());

                      pOutput.accept(ModItems.GOLDENEAGLEFEATHER.get());
                      pOutput.accept(ModItems.BALDEAGLEFEATHER.get());
                      pOutput.accept(ModItems.WHITETAILEDEAGLEFEATHER.get());

                      pOutput.accept(ModItems.RAWEAGLEMEAT.get());
                      pOutput.accept(ModItems.RAWHAWKMEAT.get());
                      pOutput.accept(ModItems.RAWOWLMEAT.get());

                      pOutput.accept(ModItems.RAWSONGBIRDMEAT.get());
                    })
            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
