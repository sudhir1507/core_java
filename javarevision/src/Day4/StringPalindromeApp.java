package Day4;

import java.util.Scanner;

public class StringPalindromeApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		String s="";
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			s=ch[i]+s;
		}
		if(s.equals(str)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}

	}

}
