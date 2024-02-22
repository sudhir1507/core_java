package filehandling;
import java.io.*;
import java.util.Scanner;
public class OutputStreamClass {

	public static void main(String[] args)throws Exception {
		File f=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\demo\\test.txt");
		FileOutputStream fout=new FileOutputStream(f);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String str=sc.nextLine();
		byte b[]=str.getBytes();
		fout.write(b);
		fout.close();
		
		

	}

}
