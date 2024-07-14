package day3;

import java.util.Scanner;

public class ArrayPairWithGivensumApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements of array ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		int indexi=-1,indexj=-1;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(sum==(arr[i]+arr[j])) {
					indexi=i;
					indexj=j;
					break;
				}
			}
		}
		System.out.println("index values that makes sum "+sum+" is "+indexi+" and "+indexj);

	}

}
