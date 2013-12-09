package org.kondrak.shell.commander.context;

import org.kondrak.shell.commander.model.fs.FileSystem;

/**
 * This class contains the necessary components to instantiate and interact with the
 * application.
 * 
 * @author kondrak
 *
 */
public class ShellCommanderContext {
	private final FileSystem fileSystem;
	
	public ShellCommanderContext() {
		this.fileSystem = new FileSystem();
	}
	
	public FileSystem getFileSystem() {
		return this.fileSystem;
	}
}
