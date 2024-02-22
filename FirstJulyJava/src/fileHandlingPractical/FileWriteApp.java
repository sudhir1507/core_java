package fileHandlingPractical;

import java.io.*;
import java.util.Scanner;

public class FileWriteApp {

	public static void main(String[] args) throws IOException {
//		File f=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer123.txt");
//		f.createNewFile();
		FileWriter fw=new FileWriter("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data in file");
		String data=sc.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("Data saved in File");
	}

}
