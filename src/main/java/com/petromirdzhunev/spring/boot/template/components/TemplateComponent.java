package com.petromirdzhunev.spring.boot.template.components;

import com.petromirdzhunev.spring.boot.template.config.TemplateConfigurationProperties;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TemplateComponent {

	private final TemplateConfigurationProperties properties;

	public Integer count() {
		return properties.count();
	}
}
