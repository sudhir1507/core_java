package basic_programs;

import java.util.Scanner;

public class NRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the position to rotate");
		int pos=sc.nextInt();
		System.out.println("Array before "+pos+" position ");
		for(int i=0;i<pos;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nArray After "+pos+" position ");
		for(int i=pos;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nArray After rotation by "+pos+" positions");
		while(pos!=0) {
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[size-1]=temp;
			pos--;
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
