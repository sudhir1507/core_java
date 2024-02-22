package basic_programs;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows ");
		int rows=sc.nextInt();
		System.out.println("Enter the cols");
		int cols=sc.nextInt();
		int a[][]=new int [rows][cols];
		int b[][]=new int[cols][rows];
		System.out.println("Enter the element in matrix");
		for (int i = 0; i <rows; i++) {
			for(int j=0;j<cols;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <cols; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose of matrix");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[j][i]=a[i][j];
			}
		}
		for (int i = 0; i <cols; i++) {
			for (int j = 0; j <rows; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
