package org.techbull;

public class Fourth {

	public static void main(String[] args) {
//		for(int i=1;i<=9;i++) {
//			int k=5+i;
//			int n=10-i;
//			for(int j=1;j<=9;j++) {
//				if(j<=10-i&&k<=9) {
//					if(k==9) {
//						int m=k;
//						System.out.print(m--);
//					}else {
//						System.out.print(k++);
//					}
//					
//				}else if(j<=10-i&&k>=9) {
//					
//					System.out.print(n--);
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		for (int i = 0; i < 9; i++) {
            int current = 6;
            // Determine the starting number for the current row
            for (int k = 0; k < i; k++) {
                current = getNextNumber(current);
            }
            // Print the numbers in the current row
            for (int j = i; j < 9; j++) {
                System.out.print(current + " ");
                current = getNextNumber(current);
            }
            System.out.println();
        }
    }

    private static int getNextNumber(int current) {
        if (current == 6) return 8;
        if (current == 8) return 7;
        if (current == 7) return 9;
        if (current == 9) return 5;
        if (current == 5) return 4;
        if (current == 4) return 3;
        if (current == 3) return 2;
        if (current == 2) return 1;
        return -1; // To handle unexpected cases
   }

	

}
