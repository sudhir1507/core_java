package org.techbull;

public class PascalTringle {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			int k=1;
			for(int j=1;j<=7;j++) {
				if(i>=j) {
					System.out.print(k+" ");
					k=k*(i-j)/j;	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
