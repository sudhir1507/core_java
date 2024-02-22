package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamIMGCopyPasteApp {

	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\demo\\avengers.jpg");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\avengers.jpg");
		int data;
		while((data=file.read())!=-1) {
			fout.write(data);
		}
		fout.close();
		file.close();
		System.out.println("saved...");
	}

}
