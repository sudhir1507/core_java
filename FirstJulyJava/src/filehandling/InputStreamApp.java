package filehandling;

import java.io.FileInputStream;

public class InputStreamApp {

	public static void main(String[] args) throws Exception{
		FileInputStream fin=new FileInputStream("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer3.txt");
		int data;
		while((data=fin.read())!=-1) {
			System.out.print((char)data);
		}
	}

}
