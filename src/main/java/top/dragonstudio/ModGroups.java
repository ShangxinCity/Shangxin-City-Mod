package top.dragonstudio;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModGroups {
	public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of("shangxin-city-mod", "item_group"));
	public static final ItemGroup SHANGXIN_FOOD = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.SHIT))
		.displayName(Text.translatable("itemgroup.shangxin-city-mod.shangxinfood"))
		.build();
}
