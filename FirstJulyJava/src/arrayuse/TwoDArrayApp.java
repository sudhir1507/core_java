package arrayuse;

import java.util.Scanner;

public class TwoDArrayApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of rows");
		int rows=sc.nextInt();
		int a[][]=new int[rows][];
		System.out.println("Enter no of columns per row");
		for (int i = 0; i < a.length; i++) {
			 
				a[i]=new int[sc.nextInt()];
			
		}
		System.out.println("Enter the elements of jagged array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		for(int b[]:a) {
			for(int k:b) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	

}
