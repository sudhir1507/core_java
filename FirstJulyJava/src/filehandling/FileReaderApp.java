package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer2.txt");
		FileReader fr=new FileReader(file);
		int data;
		while((data=fr.read())!=-1) {
			System.out.print((char)data);
		}
	}

}
