package class_object_assignment;

import java.util.Scanner;

class PrintMatrix{
	int a[][];
	void acceptTwoDArray(int x[][]){
		a=x;
	}
	void show() {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.printf("%d ",a[i][j]);
			}
			System.out.println();
		}
	}
}
public class PrintMatrixApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix elements:");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j]=sc.nextInt();
			}
		}
		PrintMatrix pp=new PrintMatrix();
		pp.acceptTwoDArray(x);
		pp.show();
		sc.close();
	}

}
