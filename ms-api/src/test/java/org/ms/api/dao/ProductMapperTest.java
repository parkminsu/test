package org.ms.api.dao;

import java.util.List;

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
	ProductMapper productMapper;
	
	@Transactional
	@Test
	public void testInsertAndSelectAll() {
		productMapper.deleteAll();
		Product product = new Product();
		product.setName("PRO1");
		product.setPrice(1234);
		product.setDescription("DESC1");
		int affectedRow = productMapper.insert(product);
		System.out.println("AffectedRow : " + affectedRow);
		List<Product> list = productMapper.selectAll();
		for(Product retProduct : list) {
			System.out.println(retProduct.toString());
		}
	}
}
