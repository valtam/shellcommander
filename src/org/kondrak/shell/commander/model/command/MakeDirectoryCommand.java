package org.kondrak.shell.commander.model.command;

import org.kondrak.shell.commander.exception.CommandException;
import org.kondrak.shell.commander.model.Command;
import org.kondrak.shell.commander.model.Directory;
import org.kondrak.shell.commander.model.directory.UnixDirectory;
import org.kondrak.shell.commander.model.fs.FileSystem;

public class MakeDirectoryCommand implements Command<Directory> {

	/**
	 * MakeDirectoryCommand will add a child node to the filesystem at the current
	 * working directory provided a single parameter is passed, else it will throw
	 * a command exception to indicate the correct parameters were not supplied.
	 * 
	 * @param fs - the filesystem to which the node is being added
	 * @param args - the arguments passed to the command
	 * @throws CommandException indicating the supplied parameters were incorrect
	 */
	@Override
	public Directory execute(FileSystem fs, String[] args) throws CommandException {
		if(args.length == 1) {
			fs.getCwd().addNode(new UnixDirectory(args[0], fs.getCwd()));
			return fs.getCwd();
		} else {
			throw new CommandException(args.toString());
		}
	}

}
