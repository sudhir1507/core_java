package filehandling;
import java.io.*;
public class CreateFolderApp {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\demo");
		if(f.exists()) {
			System.out.println("Folder present");
		}else {
			boolean b=f.mkdir();
			if(b) {
				System.out.println("Folder created successfully...!");
			}else {
				System.out.println("Oops..Some Problem is there...!");
			}
		}
	}

}
