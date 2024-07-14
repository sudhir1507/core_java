package javaStrings;

import java.util.Scanner;
class StringWordRev{
	public String reverseWord(String str) {
		String s[]=str.split(" ");
		String ss="";
		for(int i=0;i<s.length;i++) {
			ss=s[i]+" "+ss;
		}
		return ss;
	}
}
public class ReverseStringWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		System.out.println("String before reverse "+str);
		StringWordRev obj=new StringWordRev();
		String ss=obj.reverseWord(str);
		System.out.println("String before reverse "+ss);	
	}
}
