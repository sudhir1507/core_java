package org.techbull;
public class SolidStarNumPattern {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			
			for(int j=1;j<=7;j++) {
				if(j>=5-i&&j<4+i&&i<4) {
					if(j%2==1)
						System.out.print(i);
					else
					    System.out.print("*");
					
				}else if(j>=i-4&&j<=12-i&&i>=4) {
					if(j%2==1)
						System.out.print(i);
					else
					    System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
