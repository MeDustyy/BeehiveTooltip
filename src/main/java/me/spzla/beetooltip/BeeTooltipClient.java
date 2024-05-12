package me.spzla.beetooltip;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeeTooltipClient implements ClientModInitializer {
    public static final String MOD_ID = "BeeTooltip";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Initializing BeeTooltip");
    }
}
