package net.synchlabs.pandora.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.gen.GenerationStep;
import net.synchlabs.pandora.world.dimension.PandoraDimension;
import net.synchlabs.pandora.world.feature.PandoraPlacedFeatures;

import java.util.function.Predicate;

public class PandoraOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, PandoraPlacedFeatures.END_UNOBTANIUM_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, PandoraPlacedFeatures.UNOBTANIUM_ORE_PLACED.getKey().get());
    }
}
