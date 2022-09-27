package net.synchlabs.pandora;

import net.fabricmc.api.ModInitializer;
import net.synchlabs.pandora.block.PandoraBlocks;
import net.synchlabs.pandora.item.PandoraItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PandoraMod implements ModInitializer {
	public static final String MOD_ID = "pandora";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(){

		PandoraItems.registerModItems();
		PandoraBlocks.registerModBlocks();

	}
}
