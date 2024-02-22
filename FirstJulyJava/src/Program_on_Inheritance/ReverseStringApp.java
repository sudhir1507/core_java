package Program_on_Inheritance;

import java.util.Scanner;

public class ReverseStringApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("String before reverse :"+str);
		String s="";
		char c[]=str.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			s=s+c[i]; 				// abc
		}
		
		System.out.println("after reverse string "+s);
	}

}
