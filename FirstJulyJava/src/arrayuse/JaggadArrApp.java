package arrayuse;

import java.util.Scanner;

public class JaggadArrApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows,col;
		System.out.println("Enter number of rows in jagged array");
		rows =sc.nextInt();
		int a[][]=new int[rows][];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter number of col in "+i+" row");
			col=sc.nextInt();
			a[i]=new int[col];
		}
		System.out.println("Enter array elements:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array Elements:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
