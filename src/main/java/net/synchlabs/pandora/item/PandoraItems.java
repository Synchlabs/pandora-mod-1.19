package net.synchlabs.pandora.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.synchlabs.pandora.PandoraMod;

public class PandoraItems {
    public static final Item UNOBTANIUM_FRAGMENT = registerItem("unobtanium_fragment",
            new Item(new FabricItemSettings().maxCount(64).group(PandoraItemGroup.PANDORA_ITEMS)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(PandoraMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        PandoraMod.LOGGER.debug("Registering Mod Items for " + PandoraMod.MOD_ID);
    }
}
