package com.wh.whserver.logconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {
	private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

	@Bean
	public String logMethod() {
		LOG.info("==========print log==========");
		return "fsfs";
	}
}
