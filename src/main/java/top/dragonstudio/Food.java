package top.dragonstudio;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class Food {
    public static final FoodComponent SHIT;

    static {
		SHIT = new FoodComponent.Builder()
				.alwaysEdible()
				.statusEffect(new StatusEffectInstance(StatusEffects.POISON, 5 * 20, 1), 0.8f)
				.statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 60 * 20, 1), 0.9f)
				.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 30 * 20, 1), 1.0f)
				.statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 60 * 20, 1), 0.7f)
				.build();
	}
}
