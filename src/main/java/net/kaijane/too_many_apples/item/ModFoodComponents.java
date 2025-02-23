package net.kaijane.too_many_apples.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents extends FoodComponents {


    // Coal Apple
    public static final FoodComponent COAL_APPLE = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000, 1), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 3000, 1), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 1), 1.0f)
            .hunger(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .build();

    // Copper Apple
    public static final FoodComponent COPPER_APPLE = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3000, 0), 1.0f)
            .hunger(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .build();

    // Iron Apple
    public static final FoodComponent IRON_APPLE = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000, 0), 1.0f)
            .hunger(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .build();

    // Diamond Apple
    public static final FoodComponent DIAMOND_APPLE = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3000, 0), 1.0f)
            .hunger(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .build();

    // Enchanted Diamond Apple
    public static final FoodComponent ENCHANTED_DIAMOND_APPLE = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2000, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000, 0), 1.0f)
            .hunger(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .build();

    // Enchanted Netherite Apple
    public static final FoodComponent ENCHANTED_NETHERITE_APPLE = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 600, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 2), 1.0f)
            .hunger(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .build();
}
