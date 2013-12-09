/**
 * 
 */
package org.kondrak.shell.commander.model;

import org.kondrak.shell.commander.context.ShellCommanderContext;
import org.kondrak.shell.commander.model.directory.UnixDirectory;

/**
 * @author kondrak
 *
 */
public class ShellCommander {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShellCommanderContext sc = new ShellCommanderContext();
		
		System.out.println(sc.getFileSystem().getCwd().getName());
		sc.getFileSystem().getCwd().addNode(new UnixDirectory("/bin", sc.getFileSystem().getCwd()));
		System.out.println(sc.getFileSystem().getCwd().getContentsAsList());
		
		return;
	}

}
