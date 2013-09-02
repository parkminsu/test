package org.ms.api.dao;

import java.util.List;

import org.ms.api.model.Product;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ProductDaoImpl extends JdbcDaoSupport implements BasicDao<Integer, Object, Integer, Product>{

	@Override
	public int insert(Product product, Integer generatedKey) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO PRODECT (name, description, price) VAULES (?, ?, ?)";
		return getJdbcTemplate().update(sql, new Object[] {});
	}

	@Override
	public int updateByPrimaryKey(Integer primaryKey, Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByIndex(Object index, Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer primaryKey) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByIndex(Object index) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product selectRowByPrimaryKey(Integer primaryKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product selectRowByIndex(Object index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> selectRowsByIndex(Object index) {
		// TODO Auto-generated method stub
		return null;
	}
}
