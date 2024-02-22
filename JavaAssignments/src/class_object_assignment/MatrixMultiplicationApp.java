package class_object_assignment;

import java.util.Scanner;

class MatrixMultiplication{
	int a[][],b[][];
	int c[][]=new int[3][3];
	void acceptTwoDArray(int x[][],int y[][]) {
		a=x;
		b=y;
	}
	void showMatrixMultiplication() {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				int sum=0;
				for (int k = 0; k < c.length; k++) {
					sum=sum+a[i][k]*b[k][j];
				}
				c[i][j]=sum;
			}
		}
		System.out.println("Matrix multiplication :");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class MatrixMultiplicationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]=new int[3][3];
		int y[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first matrix elements :");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second matrix Elements :");
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y.length; j++) {
				y[i][j]=sc.nextInt();
			}
		}
		MatrixMultiplication mm=new MatrixMultiplication();
		mm.acceptTwoDArray(x, y);
		mm.showMatrixMultiplication();
		sc.close();
	}

}
