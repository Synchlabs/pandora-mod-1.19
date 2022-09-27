package net.synchlabs.pandora.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.synchlabs.pandora.PandoraMod;

public class PandoraItemGroup {
    public static final ItemGroup PANDORA_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(PandoraMod.MOD_ID, "pandora_items"), () -> new ItemStack(PandoraItems.UNOBTANIUM_FRAGMENT));

}
