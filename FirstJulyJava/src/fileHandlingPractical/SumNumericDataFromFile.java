package fileHandlingPractical;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SumNumericDataFromFile {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer123.txt");
		FileReader fr=new FileReader(f);
		int data;
		int sum=0;
		while((data=fr.read())!=-1) {
			if(data>=48&&data<=57) {
				sum=sum+data-48;
			}
		}
		System.out.println("Sum is "+sum);
	}

}
