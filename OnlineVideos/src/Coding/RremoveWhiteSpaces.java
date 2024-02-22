package Coding;

import java.util.Scanner;

public class RremoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.replaceAll("\\s", "");
		System.out.println("After removing white spaces: "+str);

	}

}
