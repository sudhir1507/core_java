package org.newpattern;
/*
987654321
87654321
7654321
654321
54321
4321
321
21
1*/
public class Fifth {

	public static void main(String[] args) {
		int i=9;
		while(i>=1) {
			int j=i;
			while(j>=1) {
				System.out.print(j+" ");
				j--;
			}
			i--;
			System.out.println();
		}     
	}
}
