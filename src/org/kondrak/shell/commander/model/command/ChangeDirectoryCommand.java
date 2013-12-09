package org.kondrak.shell.commander.model.command;

import org.kondrak.shell.commander.model.Command;
import org.kondrak.shell.commander.model.Directory;
import org.kondrak.shell.commander.model.fs.FileSystem;

public class ChangeDirectoryCommand implements Command<Directory> {

	@Override
	public Directory execute(FileSystem fs, String[] args) {
		return null;
	}

}
