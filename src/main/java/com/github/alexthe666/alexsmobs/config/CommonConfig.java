package com.github.alexthe666.alexsmobs.config;

import com.google.common.collect.Lists;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public class CommonConfig {


    public final ForgeConfigSpec.ConfigValue<List<? extends String>> transmutationBlacklist;

        transmutationBlacklist = builder.comment("List of items that cannot be put in a Transmuting Table.").defineList("transmutationBlacklist", Lists.newArrayList("minecraft:beacon"), o -> o instanceof String);
        limitTransmutingToLootTables = buildBoolean(builder, "limitTransmutingToLootTables", "all", false, "True if transmutation tables should not have the ability to pick up new items to transmute, and only give options from the loot tables.");
        transmutingTableExplodes = buildBoolean(builder, "transmutingTableExplodes", "all", true, "True if transmutation tables can explode when broken.");
        transmutingExperienceCost = buildInt(builder, "transmutingExperienceCost", "all", AMConfig.transmutingExperienceCost, 0, 100000,"The experience, in levels, that each transmutation of a stack takes in the transmuting table.");
        transmutingWeightAddStep = buildDouble(builder, "transmutingWeightAddStep", "all", 3.0F, 1.0F, 10000.0F, "The step value multiplied by the log of the stack size when transmuting an item, used to determine its weight for appearing in future transmutation possibilities. Higher number = more likely to appear.");
        transmutingWeightRemoveStep = buildDouble(builder, "transmutingWeightRemoveStep", "all", 4.0F, 1.0F, 10000.0F, "The step value that an item looses when selecting it as the transmutation result. Keep this number higher than the one above for balance reasons. Higher number = less likely to appear after transmuting multiple times.");
       
    }

