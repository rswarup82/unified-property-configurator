package org.springframework.common.propertyconfigurator.core;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({"classpath:META-INF/spring/property-placeholder-configurer-test-context-varioussource.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class VariousSourceCombinePropertyPlaceholderConfigurerTest {

	@Autowired
	CombinePropertyPlaceholderConfigurer combinePropertyPlaceholderConfigurer;
	
	@Test
	@Ignore
	public void testLoadPropertyFromVariousLocation() {
		assertNotNull(combinePropertyPlaceholderConfigurer);
		assertNotNull(combinePropertyPlaceholderConfigurer.getCombineProps());
		assertNotNull(combinePropertyPlaceholderConfigurer.getCombineProps().getProperty("10594963"));
		assertNotNull(combinePropertyPlaceholderConfigurer.getCombineProps().getProperty("neo4jadmin"));
		assertNotNull(combinePropertyPlaceholderConfigurer.getCombineProps().getProperty("neo4j"));
	}
}
