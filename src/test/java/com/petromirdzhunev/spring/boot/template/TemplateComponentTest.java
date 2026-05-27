package com.petromirdzhunev.spring.boot.template;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.petromirdzhunev.spring.boot.template.components.TemplateComponent;
import com.petromirdzhunev.spring.boot.template.fixtures.SpringBootStarterTemplateTestApplication;

@SpringBootTest(classes = SpringBootStarterTemplateTestApplication.class)
@TestPropertySource(properties = {
		"libraries.template.count=2"
})
class TemplateComponentTest {

	@Autowired
	private TemplateComponent templateComponent;

	@Test
	void testTemplate() {
		assertThat(templateComponent).isNotNull();
	}

	@Test
	void testCount() {
		assertThat(templateComponent.count()).isEqualTo(2);
	}

}