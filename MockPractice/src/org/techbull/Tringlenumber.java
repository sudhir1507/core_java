package org.techbull;

public class Tringlenumber {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int k=1;
			for(int j=1;j<=7;j++) {
				if(j>=5-i&&j<=3+i) {
					System.out.print(j>3?k--:k++);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
