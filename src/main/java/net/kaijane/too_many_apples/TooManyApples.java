package net.kaijane.too_many_apples;

import net.fabricmc.api.ModInitializer;
import net.kaijane.too_many_apples.item.Apples;
import net.kaijane.too_many_apples.item.ModItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TooManyApples implements ModInitializer {

	public static final String MOD_ID = "too_many_apples";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Too Many Apples is initializing!");

		Apples.registerApples();
		ModItemGroup.registerItemGroups();

	}
}