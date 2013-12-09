package org.kondrak.shell.commander.exception;

public class RootIterationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6558607055603106072L;
	
	public RootIterationException() {
		super("Cannot traverse above root!");
	}

}
