package Coding;

import java.util.Scanner;

public class SwappingBit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First no: ");
		int a=sc.nextInt();
		System.out.println("Enter Second no: ");
		int b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping "+ "a: "+a+" b: "+b);

	}

}
