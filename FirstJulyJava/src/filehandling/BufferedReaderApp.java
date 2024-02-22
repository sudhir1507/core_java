package filehandling;

import java.io.*;

public class BufferedReaderApp {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer2.txt");
		FileReader fr=new FileReader(file);
		BufferedReader fb=new BufferedReader(fr);
		String str=null;
		while((str=fb.readLine())!=null) {
			System.out.println(str);
		}
	}

}
