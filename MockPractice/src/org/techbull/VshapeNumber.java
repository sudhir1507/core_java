package org.techbull;

public class VshapeNumber {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int k=1;
			int m=0;
			for(int j=1;j<=10;j++) {
				if(i>=j) {
					System.out.print(k++);
					m=k;
				}else if(j>=5&&j>=11-i) {
					System.out.print(--m);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
