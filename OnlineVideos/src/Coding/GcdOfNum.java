package Coding;

import java.util.Scanner;

public class GcdOfNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First no: ");
		int a=sc.nextInt();
		System.out.println("Enter Second no: ");
		int b=sc.nextInt();
		int gcd=1;
		for(int i=1;i<=a&& i<=b;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		System.out.printf("gcd of %d and %d:%d ",a,b,gcd);

//		while(a!=b) {
//			if(a>b) {
//				a=a-b;
//			}else {
//				b=b-a;
//			}
//		}
//		System.out.println("gcd is: "+b);
	}

}
