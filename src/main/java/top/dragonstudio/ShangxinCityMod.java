package top.dragonstudio;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShangxinCityMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Shangxin City Mod");

	@Override
	public void onInitialize() {
		LOGGER.info("Welcome to Shangxin!");
		ModItems.initialize();
		Registry.register(Registries.ITEM_GROUP, ModGroups.CUSTOM_ITEM_GROUP_KEY, ModGroups.SHANGXIN_FOOD);
		ItemGroupEvents.modifyEntriesEvent(ModGroups.CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
			itemGroup.add(ModItems.SHIT);
		});
	}
}