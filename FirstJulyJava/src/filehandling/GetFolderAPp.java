package filehandling;

import java.io.*;

public class GetFolderAPp {

	public static void main(String[] args) {
		File f= new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java");
		File file[]=f.listFiles();
        for(int i=0;i<file.length;i++) {
        	if(file[i].isDirectory()) {
        		System.out.println(file[i]);
        	}
        }
	}

}
