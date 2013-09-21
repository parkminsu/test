package org.ms.api.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ms.api.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/applicationContext.xml"})
public class ProductMapperTest {
	@Autowired
	private ProductMapper productMapper;
	private Product product; 
	
	@Before
	public void setUp() {
		product = new Product();
		product.setName("PRO1");
		product.setPrice(1234);
		product.setDescription("DESC1");
	}
	
	@Transactional
	@Test
	public void testInsert() {
		int affectedRow = productMapper.insert(product);
		assertThat(affectedRow, is(1));
	}
}
