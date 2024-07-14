package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOps {

	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer.txt");
		BufferedReader f=new BufferedReader(file);
		String str;
		int countlines=0;
		int whitespaces=0;
		int wcount=0;
		int spcount=0;
		while((str=f.readLine())!=null) {
			char c[]=str.toCharArray();
			for(int i=0;i<c.length;i++) {
				if(c[i]==10) {
					countlines++;
				}
				if(c[i]==' '||c[i]=='\n') {
					wcount++;
				}
				if(!(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z'||(c[i]>=47)&&(c[i]<=57))) {
					spcount++;
				}
			}
			
		}
		System.out.println(countlines+"\t"+wcount+"\t"+spcount);

	}

}
