package org.techbull;

public class InvertedRightAnglet {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			int k=10-i;
			for(int j=1;j<=9;j++) {
				if(j<=10-i) {
					System.out.print(k--);
				}
			}
			System.out.println();
		}
	}
}
