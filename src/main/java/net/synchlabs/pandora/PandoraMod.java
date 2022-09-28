package net.synchlabs.pandora;

import net.fabricmc.api.ModInitializer;
import net.synchlabs.pandora.block.PandoraBlocks;
import net.synchlabs.pandora.item.PandoraItems;
import net.synchlabs.pandora.world.dimension.PandoraDimension;
import net.synchlabs.pandora.world.feature.PandoraConfiguredFeatures;
import net.synchlabs.pandora.world.gen.PandoraOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PandoraMod implements ModInitializer {
	public static final String MOD_ID = "pandora";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(){
		PandoraConfiguredFeatures.registerConfiguredFeatures();

		PandoraItems.registerModItems();
		PandoraBlocks.registerModBlocks();

		PandoraOreGeneration.generateOres();
		PandoraDimension.register();

	}
}
