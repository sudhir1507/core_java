package filehandling;
import java.io.*;
import java.util.Scanner;
public class FileApp {

	public static void main(String[] args) throws IOException,InterruptedException{
//		File f[]=File.listRoots();
//		for(int i=0;i<f.length;i++) {
//			long fs=f[i].getFreeSpace();
//			long ts=f[i].getTotalSpace();
//			System.out.println(f[i]+" "+ts+" "+fs);
		
//		}
		OutputStream file=new FileOutputStream("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer2.txt");
		//FileWriter f=new FileWriter(file,true);
		//BufferedWriter fb=new BufferedWriter(f);
		//FileReader fr=new FileReader(file);
		//BufferedReader f=new BufferedReader(fr); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String data=sc.nextLine();
//        fb.write(data);
//        fb.newLine();
//        System.out.println("Succes....");
//        fb.close();
		//int data;
		byte b[]=data.getBytes();
//		while((data=f.readLine())!=null) {
//			System.out.println(data);
//			Thread.sleep(1000);
//		}
		file.write(b);
		System.out.println("success..");
        file.close();
        //sc.close();
	}

}
