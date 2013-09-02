package org.ms.api.hsql;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Properties;

import org.hsqldb.Server;
import org.hsqldb.persist.HsqlProperties;
import org.hsqldb.server.ServerAcl.AclFormatException;
import org.ms.api.hsql.exception.HsqlAclFormateException;
import org.ms.api.hsql.exception.HsqlIOException;
import org.ms.api.hsql.exception.HsqlNotSetPropertiesException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;

/**
 * 참고 사이트 : http://www.javacodegeeks.com/2012/11/embedding-hsqldb-server-instance-in-spring.html
 * @author mspark
 *
 */
public class HyperSqlDbServer implements SmartLifecycle {
	private final Logger logger = LoggerFactory.getLogger(HyperSqlDbServer.class);
	private HsqlProperties properties;
	private Server server;
	private boolean running = false;
	
	@Override
	public boolean isRunning() {
		// TODO Auto-generated method stub
		if(server != null) {
			server.checkRunning(running);
		}
		return running;
	}
	
	public void setProperties(Properties properties) {
		this.properties = new HsqlProperties(properties);
		properties.keySet();
	}
	
	public Properties getProperties() {
		return this.properties.getProperties();
	}
	
	protected void printProperties() {
		Properties properties = getProperties();
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		properties.list(printWriter);
		printWriter.flush();
		printWriter.close();	
		logger.debug(stringWriter.toString());
			
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		String errorMessage = null;
		
		if(properties == null) {
			errorMessage = "Error starting HSQL server - properties must be set.";
			logger.error(errorMessage);
			throw new HsqlNotSetPropertiesException(errorMessage);
		}
		
		if(server == null) {
			logger.info("Starting HSQL server...");
			server = new Server();
			try {
				server.setProperties(properties);
				server.start();
				running = true;
			} catch(AclFormatException e) {
				errorMessage = "Error starting HSQL server";
				logger.error(errorMessage, e);
				throw new HsqlAclFormateException(e);
			} catch (IOException e) {
				errorMessage = "Error starting HSQL server";
				logger.error(errorMessage, e);
				throw new HsqlIOException(e);
			}
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		logger.info("Stopping HSQL server...");
		if(server != null) {
			server.stop();
			running = false;
		}
	}

	@Override
	public int getPhase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void stop(Runnable runnable) {
		// TODO Auto-generated method stub
		stop();
		runnable.run();
	}
}
