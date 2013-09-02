package org.ms.api;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class testApplicationContext {
	@Autowired 
	private ApplicationContext context;
	
	@Before
	public void setUp() throws FileNotFoundException {
		Log4jConfigurer.initLogging("classpath:log4j.xml");
	}
	
	@Test
	public void testLoadApplicationContext() {
		assertThat(context, instanceOf(ApplicationContext.class));
	}
}
