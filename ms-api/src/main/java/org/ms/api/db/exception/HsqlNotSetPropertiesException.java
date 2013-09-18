package org.ms.api.db.exception;

public class HsqlNotSetPropertiesException extends RuntimeException {
	private static final long serialVersionUID = 2441082959385732137L;
	public HsqlNotSetPropertiesException() {
		super();
	}
	public HsqlNotSetPropertiesException(String message) {
		super(message);
	}
	public HsqlNotSetPropertiesException(Throwable t) {
		super(t);
	}
	public HsqlNotSetPropertiesException(String message, Throwable t) {
		super(message, t);
	}
}
