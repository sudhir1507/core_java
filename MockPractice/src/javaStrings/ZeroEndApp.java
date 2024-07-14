package javaStrings;

import java.util.Scanner;

public class ZeroEndApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {         //1 0 2 0 3
				arr[count++]=arr[i];
			}
		}
		while(count<arr.length) {
			arr[count++]=0;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}     
	}
}
