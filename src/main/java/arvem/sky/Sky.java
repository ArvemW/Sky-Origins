package arvem.sky;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sky implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("sky");
	public static final Item WINGED_LIGHT = new Item(new Item.Settings().group(ItemGroup.COMBAT).maxCount(1).fireproof().rarity(Rarity.RARE));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("sky", "winged_light"), WINGED_LIGHT);
		Sounds.registerflap();
		Sounds.registerboost();
		Sounds.registerwhoosh();
		Sounds.registerbeatslow();
		Sounds.registerbeatmid();
		Sounds.registerbeatfast();
		Sounds.registerdefaultshout();
		Sounds.registerbirdshout();
		Sounds.registercrabshout();
		Sounds.registerghostshout();
		Sounds.registerwhaleshout();
		Sounds.registerjellyshout();
		Sounds.registermantashout();
		LOGGER.info("Hello Fabric world!");
	}
}
