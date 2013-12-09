package org.kondrak.shell.commander.exception;

public class CommandException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6261077042764632554L;

	public CommandException(String command) {
		super("Oops!  Something was wrong with your command: " + command);
	}
}
