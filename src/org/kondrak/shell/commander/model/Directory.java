package org.kondrak.shell.commander.model;

import java.util.List;

import org.kondrak.shell.commander.exception.RootIterationException;

public interface Directory {
	
	public String getName();
	
	public void setContents (List<Directory> contents);
	
	public List<Directory> getContents ();
	
	public List<String> getContentsAsList();
	
	public Directory getParent() throws RootIterationException;
	
	public void addNode(Directory d);
}
