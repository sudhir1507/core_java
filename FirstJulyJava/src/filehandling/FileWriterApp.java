package filehandling;

import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriterApp {

	public static void main(String[] args) throws IOException{
		File f=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer2.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bf=new BufferedWriter(fw);
		System.out.println("ENter data in file");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		bf.write(str);
		bf.newLine();
		System.out.println("Data Stored..");
		bf.close();
		fw.close();
		sc.close();
	}

}
