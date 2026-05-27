package com.petromirdzhunev.spring.boot.template.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("libraries.template")
public record TemplateConfigurationProperties(Integer count) {
}
