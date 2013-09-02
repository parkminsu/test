package org.ms.api.hsql.exception;

public class HsqlAclFormateException extends RuntimeException{
	private static final long serialVersionUID = 7892134464223257909L;
	public HsqlAclFormateException() {
		super();
	}
	public HsqlAclFormateException(String message) {
		super(message);
	}
	public HsqlAclFormateException(Throwable t) {
		super(t);
	}
	public HsqlAclFormateException(String message, Throwable t) {
		super(message, t);
	}
}
