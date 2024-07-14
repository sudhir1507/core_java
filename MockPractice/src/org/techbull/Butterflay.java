package org.techbull;

public class Butterflay {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			int n=i<=4?i:8-i;
			for(int j=1;j<=8;j++) {
				if((j<=i||j>8-i)&&i<=4) {
					System.out.print(j<=i?n--:n++);
				}else if((j<=8-i||j>i)&&i>=4) {
					System.out.print(j<=8-i?n--:n++);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
