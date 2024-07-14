package Day9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckPrimeNumberApp {

	public static void main(String[] args) throws IOException {
		FileWriter file=new FileWriter("C:\\Users\\ACER\\Documents\\GTH Practicals\\All revision\\prime.txt",true);
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Array size");
	    int size=sc.nextInt();
	    int a[]=new int[size];
	    System.out.println("Enter Array Elements");
	    for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}                                     // 2 3 4 5 6 7 8 9 11
	    for (int i = 0; i < a.length; i++) {
	    	int count=0;          //
	    	for (int j = 2; j < a[i]; j++) {
				if(a[i]%j==0) {
					count++;
					break;
				}
			}
	    	if(count==0) {
	    		file.write(String.valueOf(a[i])+"\t");
	    	}
		}
	    System.out.println("Saved success..!");
	    file.close();
	}

}
