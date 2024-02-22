package filehandling;

import java.io.File;

public class DirectoryCheckApp {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\demo");
		if(f.isDirectory()) {
			System.out.println("Folder Present");
		}else {
			System.out.println("Folder not present");
		}

	}

}
