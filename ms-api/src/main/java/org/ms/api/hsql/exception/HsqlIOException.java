package org.ms.api.hsql.exception;

public class HsqlIOException extends RuntimeException {
	private static final long serialVersionUID = -7730002160129604599L;
	public HsqlIOException() {
		super();
	}
	public HsqlIOException(String message) {
		super(message);
	}
	public HsqlIOException(Throwable t) {
		super(t);
	}
	public HsqlIOException(String message, Throwable t) {
		super(message, t);
	}
}
