package org.techbull;

public class RightTNumberSL {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int k=i;
			for(int j=1;j<=5;j++) {
				if(i>=j) {
					System.out.print(k++);
				}
			}
			System.out.println();
		}
	}
}
