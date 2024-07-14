package org.techbull;
/*
123454321
1234321
12321
121
1
 * */
public class TringleINDI {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int k=1;
			for(int j=1;j<=9;j++) {
				if(j>=i&&j<=10-i) {
					System.out.print(j<5?k++:k--);
				}
			}
			System.out.println();
		}

	}

}
