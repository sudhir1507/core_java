package org.techbull;

/*
    1          
  121         
 12321        
1234321       
       1234321
        12321 
         121  
          1 
 * */
public class TringleFirst {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			int k = 1;
			for (int j = 1; j <= 14; j++) {
				if (j <= 7) {
					if (j >= 5 - i && j <= 3 + i && i <= 4) {
						System.out.print(j <= 3 ? k++ : k--);
					} else {
						System.out.print(" ");
					}
				} else {
					if (j > i + 2 && j <= 19 - i && i > 4) {
						System.out.print(j <= 10 ? k++ : k--);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

//		int i = 1;
//		while (i <= 8) {
//			int j = 1;
//			int k = 1;
//			while (j <= 14) {
//				if (i <= 7) {
//					if (j >= 5 - i && j <= 3 + i && i <= 4) {
//						System.out.print(j <= 3 ? k++ : k--);
//					} else {
//						System.out.print(" ");
//					}
//				} else {
//					if (j > i + 2 && j <= 19 - i && i > 4) {
//						System.out.print(j <= 10 ? k++ : k--);
//					} else {
//						System.out.print(" ");
//					}
//				}
//
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
	}
}
