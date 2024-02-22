package filehandling;

import java.io.*;

public class FileInputStreamClass {

	public static void main(String[] args) throws Exception {
		File f=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\demo\\test.txt");
		FileInputStream fin=new FileInputStream(f);
		int b;
		while((b=fin.read())!=-1) {
			System.out.print((char)b);
		}
		fin.close();
	}

}
