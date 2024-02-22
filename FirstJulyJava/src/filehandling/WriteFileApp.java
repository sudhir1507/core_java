package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFileApp {

	public static void main(String[] args) throws IOException {
		String str="hi this is java";
		Path file=Path.of("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer1.txt");
		Files.writeString(file, str);
		String file_content=Files.readString(file);
		System.out.println(file_content);
	}

}
