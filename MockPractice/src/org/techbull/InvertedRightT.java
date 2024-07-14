package org.techbull;

public class InvertedRightT {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			int k=5+i;
			int n=10-i;
			for(int j=1;j<=9;j++) {
				if(j<=10-i&&k<=9) {
					System.out.print(k++);
				}else if(j<=10-i&&k>=9) {
					
					System.out.print(n--);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
//       String start = "678954321";
//        
//        // Print each line by reducing the size of the string
//        for (int i = 0; i < start.length(); i++) {
//            System.out.println(start.substring(i));
//        }
		
	}
}
