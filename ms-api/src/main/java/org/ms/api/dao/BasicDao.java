package org.ms.api.dao;

import java.util.List;

public interface BasicDao<P, I, GK, T> {
	public int insert(T value, GK generatedKey);
	public int updateByPrimaryKey(P primaryKey, T value);
	public int updateByIndex(I index, T value);
	public int deleteByPrimaryKey(P primaryKey);
	public int deleteByIndex(I index);
	public int deleteAll();
	public T selectRowByPrimaryKey(P primaryKey);
	public T selectRowByIndex(I index);
	public List<T> selectRowsByIndex(I index);
}
