package filehandling;

import java.io.File;

public class ListDriveApp {

	public static void main(String[] args) {
		File f[]=File.listRoots();
		for(int i=0;i<f.length;i++) {
		long totalspace=f[i].getTotalSpace();
		long totalfreespace=f[i].getFreeSpace();
		System.out.println(f[i]+" "+totalspace/1073741824 +"Gb  "+totalfreespace/1073741824 +"Gb");
		}

	}

}
