package org.techbull;
/*
1     
2 3   
3 4 5  
5 6 7 8 
 * */
public class Second {
	public static void main(String[] args) {
	    int k=3;
		for(int i=1;i<=4;i++) {
			int m=k;
			for(int j=1;j<=4;j++) {
				if(i==1&&j==1) {
					System.out.print("1 ");
				}
				if(i>=j&&i>1) {
					System.out.print(m++ +" ");
					k++;
				}else {
					System.out.print(" ");
				}	
			}
			--k;
			System.out.println();
		}
	}
}
