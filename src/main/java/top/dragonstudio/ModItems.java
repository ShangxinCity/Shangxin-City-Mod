package top.dragonstudio;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static Item register(Item item, String id) {
		Identifier itemID = new Identifier("shangxin-city-mod", id);
		Item registeredItem = Registry.register(Registries.ITEM, itemID, item);
		return registeredItem;
	}
	public static final Item SHIT = register(new Item(new FabricItemSettings().food(Food.SHIT)), "shit");



	public static void initialize() {
	}
}
