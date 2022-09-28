package net.synchlabs.pandora.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.synchlabs.pandora.PandoraMod;
import net.synchlabs.pandora.block.PandoraBlocks;

import java.util.List;

public class PandoraConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> END_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), PandoraBlocks.END_UNOBTANIUM_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> PANDORA_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.STONE), PandoraBlocks.UNOBTANIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_UNOBTANIUM_ORE =
            ConfiguredFeatures.register("ore_end_unobtanium", Feature.ORE, new OreFeatureConfig(END_ORES, 4));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> UNOBTANIUM_ORE =
            ConfiguredFeatures.register("ore_unobtanium", Feature.ORE, new OreFeatureConfig(PANDORA_ORES, 6));

    public static void registerConfiguredFeatures() {
        PandoraMod.LOGGER.debug("Registering the ModConfiguredFeatures for " + PandoraMod.MOD_ID);
    }
}
