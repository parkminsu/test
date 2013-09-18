package org.ms.api.db.hsql;

import java.io.IOException;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hsqldb.cmdline.SqlFile;
import org.hsqldb.cmdline.SqlToolError;
import org.ms.api.db.DbInitializer;
import org.ms.api.db.exception.DbInitializerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;

public class HyperSqlDbInitializer implements DbInitializer {
	private final Logger logger = LoggerFactory.getLogger(HyperSqlDbInitializer.class);
	private Resource resource;
	private DataSource dataSource;
	@Override
	public void setSqlFile(Resource resource) {
		// TODO Auto-generated method stub
		this.resource = resource;
	}

	@Override
	public Resource getSqlFile() {
		// TODO Auto-generated method stub
		return resource;
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource = dataSource;
	}

	@Override
	public DataSource getDataSource() {
		// TODO Auto-generated method stub
		return dataSource;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		logger.info("HyperSql DB initialize...");
		try {
			SqlFile sqlFile = new SqlFile(this.resource.getFile());
			sqlFile.setConnection(dataSource.getConnection());
			sqlFile.execute();
			logger.info("HyperSql DB initialized.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new DbInitializerException(e);
		} catch (SqlToolError e) {
			// TODO Auto-generated catch block
			throw new DbInitializerException(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DbInitializerException(e);
		}	
	}

}
