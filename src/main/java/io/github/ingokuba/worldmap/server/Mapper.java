package io.github.ingokuba.worldmap.server;

import com.mojang.logging.LogUtils;
import net.minecraftforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

public class Mapper {

    private static final Logger LOGGER = LogUtils.getLogger();

    public static void initialize(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("Mapper started");
        // TODO: generate initial world map if not exists
    }
}
