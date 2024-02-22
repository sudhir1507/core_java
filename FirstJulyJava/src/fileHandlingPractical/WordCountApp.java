package fileHandlingPractical;

import java.io.FileReader;
import java.io.IOException;

public class WordCountApp {

	public static void main(String[] args) throws IOException, InterruptedException {
		int count=0;
		FileReader fr=new FileReader("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer.txt");
		int data;
		while((data=fr.read())!=-1) {
			if(data==32||data==10) {
				count++;
			}
			
//			System.out.print((char)data);
//			Thread.sleep(1000);
		}
		System.out.println("Number of word "+count);
		fr.close();
	}

}
