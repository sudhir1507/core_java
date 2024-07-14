package day3;

import java.util.Scanner;

public class MaxMinArrayApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter aaray size ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
       System.out.println("\nmaximum is "+max);
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
       System.out.println("\nminimum is "+min);
	}

}
