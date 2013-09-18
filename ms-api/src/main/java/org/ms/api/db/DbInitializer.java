package org.ms.api.db;

import javax.sql.DataSource;

import org.springframework.core.io.Resource;

public interface DbInitializer {
	public void setSqlFile(Resource resource);
	public Resource getSqlFile();
	public void setDataSource(DataSource dataSource);
	public DataSource getDataSource();
	public void execute();
}
