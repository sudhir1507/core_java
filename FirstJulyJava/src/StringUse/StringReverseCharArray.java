package StringUse;

import java.util.Scanner;

public class StringReverseCharArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String str=sc.nextLine();
		//char ch[]=str.toCharArray();
		String ss="";
		for (int i = str.length()-1; i >=0; i--) {
			ss=ss+str.charAt(i);
		}
		System.out.println("String reverse "+ss);
	}

}
