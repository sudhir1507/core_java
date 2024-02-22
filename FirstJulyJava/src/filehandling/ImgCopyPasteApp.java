package filehandling;
import java.io.*;
public class ImgCopyPasteApp {

	public static void main(String[] args) throws Exception{
		FileInputStream fin=new FileInputStream("C:\\Users\\ACER\\Documents\\GTH Practicals\\HTML notes\\HTML & CSS\\html\\image\\road.jpg");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\demo\\road.jpg");
		int data;
		while((data=fin.read())!=-1) {
			fout.write(data);
		}
		fout.close();
		fin.close();
	}

}
