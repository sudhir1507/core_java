package arrays;

import java.util.Scanner;

public class Enhanced_For_Loop {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num1=s1.nextInt();
		int [] arr1= new int[10];
		
		for(int i=1;i<=10;i++) {
			arr1[i-1]=num1*i;
		}
System.out.println("_____________________");
	for(int n:arr1) {
		System.out.println(n);
	}

	}

}
