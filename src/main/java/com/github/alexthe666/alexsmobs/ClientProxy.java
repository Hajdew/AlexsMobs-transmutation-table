package com.github.alexthe666.alexsmobs;

import com.github.alexthe666.alexsmobs.client.gui.GUITransmutationTable;
import com.github.alexthe666.alexsmobs.client.render.tile.RenderTransmutationTable;


    public void clientInit() {
        BlockEntityRenderers.register(AMTileEntityRegistry.TRANSMUTATION_TABLE.get(), RenderTransmutationTable::new);
        MenuScreens.register(AMMenuRegistry.TRANSMUTATION_TABLE.get(), GUITransmutationTable::new);
    }

