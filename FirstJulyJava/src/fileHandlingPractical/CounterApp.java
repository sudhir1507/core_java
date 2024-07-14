package fileHandlingPractical;
import java.io.*;

public class CounterApp {

	public static void main(String[] args) throws IOException {
		int countc=0,countw=1,countv=0,countcc=0,countd=0,clines=1;
		File f=new File("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer.txt");
		FileReader fr=new FileReader(f);
		int data;
		while((data=fr.read())!=-1) {
			if(data!=-1) {
				countc++;
			}
			if(data==32||data==10) {
				countw++;
			}
			if(data==65||data==69||data==73||data==79||data==85||data==97
					||data==101||data==105||data==111||data==117) {
				countv++;
			}
			if((data>=65&&data<=90)||(data>=97&&data<=122)) {
				countcc++;
			}
			if(data>=48&&data<=57) {
				countd++;
			}
			if(data==10) {
				clines++;
			}
		}
		System.out.println("Number of charectors "+countc);
		System.out.println("Number of words "+countw);
		System.out.println("Number of vowels "+countv);
		System.out.println("Number of Consonents "+(countcc-countv));
		System.out.println("Number of Digits "+countd);
		System.out.println("Number of special Symbols "+(countc-countcc-countd));
		System.out.println("Number of lines "+clines);
	}

}
