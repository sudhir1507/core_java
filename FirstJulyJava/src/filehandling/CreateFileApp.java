package filehandling;

import java.io.*;


public class CreateFileApp {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		File f=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\test.txt");
		boolean b=f.createNewFile();
		if(b) {
			System.out.println("File created successfully..!");
		}else {
			System.out.println("File not Created...!");
		}

	}

}
