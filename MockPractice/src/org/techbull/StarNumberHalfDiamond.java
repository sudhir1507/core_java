package org.techbull;

public class StarNumberHalfDiamond {

	public static void main(String[] args) {
		for(int i=1;i<=11;i++) {
			for(int j=1;j<=7;j++) {
				if(j<=(2*i-1)&&i<=4) {
					System.out.print("*");
				}else if(j<=12-i&&i>=4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
