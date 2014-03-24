package com.ymsino.water.sys.exception;

public class AjaxActionException extends RuntimeException {

	private static final long serialVersionUID = -7227070318404880329L;

	public AjaxActionException() {
		super();
	}

	public AjaxActionException(String message) {
		super("AjaxActionException:" + message);
	}

	public AjaxActionException(String message, Throwable cause) {
		super("AjaxActionException:" + message, cause);
	}

	public AjaxActionException(Throwable cause) {
		super(cause);
	}

}
