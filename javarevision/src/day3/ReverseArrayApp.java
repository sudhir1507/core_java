package day3;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseArrayApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter aaray size ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before reverse ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		int st=0,end=arr.length-1;
		int mid=arr.length/2;
		for (st = 0; st < mid; st++) {
			int temp=arr[st];
			arr[st]=arr[end];
			arr[end]=temp;
			end--;
		}
		System.out.println("Array After reverse ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}

	}

}
