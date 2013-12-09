package org.kondrak.shell.commander.model;

import org.kondrak.shell.commander.exception.CommandException;
import org.kondrak.shell.commander.model.fs.FileSystem;

public interface Command<T> {
	T execute(FileSystem fs, String[] args) throws CommandException;
}
