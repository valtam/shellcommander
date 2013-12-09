package org.kondrak.shell.commander.systest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.kondrak.shell.commander.context.ShellCommanderContext;
import org.kondrak.shell.commander.model.Directory;
import org.kondrak.shell.commander.model.directory.UnixDirectory;

public class SysTest {
	
	@Test
	public void testApp() {
		ShellCommanderContext sc = new ShellCommanderContext();
		
		assertEquals(sc.getFileSystem().getCwd().getName(), "/");
	}
	
	@Test
	public void testMkdir() {
		ShellCommanderContext sc = new ShellCommanderContext();
		Directory d = new UnixDirectory("/bin", sc.getFileSystem().getCwd());
		sc.getFileSystem().getCwd().addNode(d);
		
		assertEquals(sc.getFileSystem().getCwd().getContentsAsList().get(0), d.getName());
	}
}
