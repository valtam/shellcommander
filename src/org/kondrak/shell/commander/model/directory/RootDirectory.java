package org.kondrak.shell.commander.model.directory;

import org.kondrak.shell.commander.exception.RootIterationException;
import org.kondrak.shell.commander.model.Directory;

/**
 * This class encapsulates the concept of a root directory, which
 * has no parent directory.
 * 
 * @author kondrak
 *
 */
public class RootDirectory extends UnixDirectory {
	private static final String ROOT = "/";
	
	public RootDirectory() {
		super(ROOT, null);
	}
	
	@Override
	public Directory getParent() throws RootIterationException {
		throw new RootIterationException();
	}
}
