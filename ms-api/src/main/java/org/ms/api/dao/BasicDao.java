package org.ms.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BasicDao<P, I, GK, T> {
	public int insert(@Param("value")T value);
	public int updateByPrimaryKey(@Param("primaryKey")P primaryKey, @Param("value")T value);
	public int updateByIndex(@Param("index")I index, @Param("value")T value);
	public int deleteByPrimaryKey(@Param("primaryKey")P primaryKey);
	public int deleteByIndex(@Param("index")I index);
	public int deleteAll();
	public T selectRowByPrimaryKey(@Param("primaryKey")P primaryKey);
	public T selectRowByIndex(@Param("index")I index);
	public List<T> selectRowsByIndex(@Param("index")I index);
	public List<T> selectAll();
}
