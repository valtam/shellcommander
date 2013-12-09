package org.kondrak.shell.commander.model.fs;

import org.kondrak.shell.commander.model.Directory;
import org.kondrak.shell.commander.model.directory.RootDirectory;

/**
 * This class contains the necessary objectives to describe a unix-like file
 * system.
 * 
 * @author kondrak.
 *
 */
public final class FileSystem {
	private final Directory root;
	private Directory currentDir;
	
	/**
	 * The default constructor creates the root directory and sets the
	 * current working directory to root.
	 */
	public FileSystem() {
		this.root = new RootDirectory();
		this.currentDir = this.root;
	}
	
	public Directory getCwd() {
		return this.currentDir;
	}
	
	public void setCwd(Directory dir) {
		this.currentDir = dir;
	}
	
	public Directory getRoot() {
		return this.root;
	}
}
