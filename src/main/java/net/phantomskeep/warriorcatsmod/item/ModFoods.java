package net.phantomskeep.warriorcatsmod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    // predator below
    public static final FoodProperties RAWEAGLEMEAT = new FoodProperties.Builder().alwaysEat().meat().saturationMod(1.0f).nutrition(8).build();
    public static final FoodProperties RAWOWLMEAT = new FoodProperties.Builder().alwaysEat().meat().saturationMod(.7f).nutrition(6).build();
    public static final FoodProperties RAWHAWKMEAT = new FoodProperties.Builder().alwaysEat().meat().saturationMod(.8f).nutrition(7).build();

    // prey below
    public static final FoodProperties RAWSONGBIRDMEAT = new FoodProperties.Builder().alwaysEat().meat().saturationMod(.6f).nutrition(5).build();

    // herbs below

}
