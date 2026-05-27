package com.petromirdzhunev.spring.boot.template.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.petromirdzhunev.spring.boot.template.components.TemplateComponent;

@AutoConfiguration
@EnableConfigurationProperties(TemplateConfigurationProperties.class)
public class SpringBootStarterTemplateAutoConfiguration {

	@Bean
	TemplateComponent templateComponent(final TemplateConfigurationProperties properties) {
		return new TemplateComponent(properties);
	}
}
