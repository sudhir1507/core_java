package Coding;

import java.util.Scanner;

public class Jarcandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N,K,s;
		System.out.println("Enter the values: ");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		s=sc.nextInt();
		if(s>=0&&s<=(N-K)) {
		System.out.println("sold cadies :"+ s);
		System.out.println("Candies left:"+ (N-s));
		}else {
			System.out.println("Invalid ");
			System.out.println("candies left:"+s);
		}
}
}
