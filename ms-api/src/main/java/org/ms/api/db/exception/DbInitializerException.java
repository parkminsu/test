package org.ms.api.db.exception;

public class DbInitializerException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8449226250481230666L;
	public DbInitializerException() {
		super();
	}
	public DbInitializerException(String message) {
		super(message);
	}
	public DbInitializerException(Throwable t) {
		super(t);
	}
	public DbInitializerException(String message, Throwable t) {
		super(message, t);
	}
}
