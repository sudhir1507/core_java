package org.newpattern;
/*
1      1
12    21
123  321
12344321
 */
public class Fourth {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int k=1;
			int m=0;
			for(int j=1;j<=8;j++) {
				if(i>=j) {
					System.out.print(k++);
					m=k;
				}else if(j>=5&&j>=9-i) {
					System.out.print(--m);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
