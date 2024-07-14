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
 */
public class FifthCopy {
	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			int k=1;
			for(int j=1;j<=7;j++) {
				if(j>=5-i&&j<=3+i&&i<=4) {
					System.out.print(j<=3?k++:k--);
				}else if(j>=i-4&&j<=12-i&&i>4) {
					System.out.print(j<=3?k++:k--);
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
