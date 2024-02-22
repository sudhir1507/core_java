package filehandling;

import java.io.File;

public class ListFIleFolderApp {

	public static void main(String[] args) {
		File f=new File("E:\\");
		File ff[]=f.listFiles();
		try {
			for(int i=0;i<f.length();i++) {
				System.out.println(ff[i]);
			}
		}catch(Exception e) {
			System.out.println("Error is "+e);
		}
	}

}
