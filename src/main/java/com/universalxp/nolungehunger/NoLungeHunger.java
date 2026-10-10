package com.universalxp.nolungehunger;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoLungeHunger implements ModInitializer {
	public static final String MOD_ID = "nolungehunger";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("No Lunge Hunger loaded: spear Lunge no longer drains hunger or saturation.");
	}
}
