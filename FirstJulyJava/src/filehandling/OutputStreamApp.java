package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class OutputStreamApp {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		File f=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer3.txt");
		FileOutputStream fout=new FileOutputStream(f);
		System.out.println("Enter data in file.");
		String s=sc.nextLine();
		byte[] b=s.getBytes();
		fout.write(b);
		System.out.println("saved...");
		fout.close();
		
	}

}
