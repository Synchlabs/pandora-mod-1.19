package net.synchlabs.pandora.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class PandoraPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> END_UNOBTANIUM_ORE_PLACED = PlacedFeatures.register("end_unobtanium_ore_placed",
            PandoraConfiguredFeatures.END_UNOBTANIUM_ORE, modifiersWithRarity(1,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(9), YOffset.fixed(22))));

    public static final RegistryEntry<PlacedFeature> UNOBTANIUM_ORE_PLACED = PlacedFeatures.register("unobtanium_ore_placed",
            PandoraConfiguredFeatures.UNOBTANIUM_ORE, modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(-22))));


    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
