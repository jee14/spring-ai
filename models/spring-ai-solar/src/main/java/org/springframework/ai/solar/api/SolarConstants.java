package org.springframework.ai.solar.api;

import org.springframework.ai.observation.conventions.AiProvider;

/**
 * Common value constants for Solar api.
 *
 * @author Seunghyeon Ji
 */
public class SolarConstants {

	public static final String DEFAULT_BASE_URL = "https://api.upstage.ai";

	public static final String PROVIDER_NAME = AiProvider.UPSTAGE.value();

	private SolarConstants() {
	}

}