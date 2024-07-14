package org.techbull;
/*
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA 
 */
public class CharacterTringle {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			char k='A';
			for(int j=1;j<=9;j++) {
				if(j>=6-i&&j<=4+i) {
					System.out.print(j<=4?k++:k--);
				}
			}
			System.out.println();
		}
	}
}
