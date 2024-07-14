package org.newpattern;
/*
   1   
  1 2  
 1 2 3 
1 2 3 4
1 2 3 4
 1 2 3 
  1 2  
   1   
 * */
public class Third {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			boolean flag=true;
			int k=1;
			for(int j=1;j<=7;j++) {
				if((j>=5-i&&j<=3+i)&&flag&&i<=4) {
					System.out.print(k++);
					flag=false;
				}else if((j>=i-4&&j<=12-i)&&flag&&i>=4) {
					System.out.print(k++);
					flag=false;
				}
				else {
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}

	}

}
