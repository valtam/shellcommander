package org.kondrak.shell.commander.model.directory;

import java.util.ArrayList;
import java.util.List;

import org.kondrak.shell.commander.exception.RootIterationException;
import org.kondrak.shell.commander.model.Directory;
import org.kondrak.shell.commander.model.fs.FileSystem;

public class UnixDirectory implements Directory {
	private String D_NAME = "";
	
	private Directory parent;
	private List<Directory> contents = new ArrayList<Directory>();
	
	public UnixDirectory (String name, Directory parent) {
		this.parent = parent;
		this.D_NAME = name;
	}
	
	@Override
	public String getName() {
		return this.D_NAME;
	}
	
	@Override
	public void setContents (List<Directory> contents) {
		this.contents = contents;
	}
	
	public List<Directory> getContents () {
		return this.contents;
	}
	
	public List<String> getContentsAsList() {
		List<String> names = new ArrayList<String>();
		
		for (Directory d : contents) {
			names.add(d.getName());
		}
		
		return names;
	}
	
	public Directory getParent() throws RootIterationException {
		return this.parent;
	}

	@Override
	public void addNode(Directory d) {
		contents.add(d);
	}
}
