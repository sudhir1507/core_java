package StringUse;

import java.util.Scanner;

public class InterleavingStringChecker {
	public static boolean interLeave(String s1,String s2,String s3) {
		int i=0,j=0,k=0;
		while(k!=s3.length()) {
			if(i<s1.length()&&s1.charAt(i)==s3.charAt(k))
			  i++;
			else if(j<s2.length()&& s2.charAt(j)==s3.charAt(k))
				j++;
			else
				return false;
			k++;
		}
		if(i<s1.length()||j<s2.length()) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String s1=sc.nextLine();
		System.out.println("Enter second String");
		String s2=sc.nextLine();
		System.out.println("Enter third String");
		String s3=sc.nextLine();
		if(interLeave(s1,s2,s3)==true) {
			System.out.println("third String is shuffle of first two strings");
		}else {
			System.out.println("Third string is not shuffle of first two string");
		}

	}

}
