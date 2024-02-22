package special_classes;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the string ");
		String str1=s1.nextLine();
		
		String temp="";
		for (int i=0;i<=str1.length()-1;i++) {
			temp=str1.charAt(i)+temp;
					
		}
		System.out.println("reverse string is: "+temp);
	}

}
