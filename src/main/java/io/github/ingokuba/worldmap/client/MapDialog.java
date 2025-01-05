package io.github.ingokuba.worldmap.client;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

public class MapDialog {

    private static final Logger LOGGER = LogUtils.getLogger();

    public static void show(FMLClientSetupEvent event) {
        LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        // TODO: init client side mod implementation
    }
}
