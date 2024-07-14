package org.newpattern;
/*
6 8 7 9 5 4 3 2 1 
8 7 9 5 4 3 2 1 
7 9 5 4 3 2 1 
9 5 4 3 2 1 
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 
 */
public class Sixth {

	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			int c=6;
			for(int j=0;j<i;j++) {
				c=getvalue(c);
			}
			for(int k=i;k<9;k++) {
				System.out.print(c+" ");
				c=getvalue(c);
			}
			System.out.println();
		}

	}
	public static int getvalue(int c) {
		if(c==6) {
			return 8; 
		}else if(c==8) {
			return 7;
		}else if(c==7) {
			return 9;
		}else if(c==9) {
			return 5;
		}else if(c==5) {
			return 4;
		}else if(c==4) {
			return 3;
		}else if(c==3) {
			return 2;
		}else if(c==2) {
			return 1;
		}else  {
			return -1;
		}
			
		
	}

}
