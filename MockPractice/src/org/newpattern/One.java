package org.newpattern;
/*
   1   
  1 2  
 1 2 3 
1 2 3 4

 * */
public class One {

	public static void main(String[] args) {
		int i=1;
		while(i<=4) {
			boolean flag=true;
			int k=1,j=1;
			while(j<=7) {
				if((j>=5-i&&j<=3+i)&&flag) {
					System.out.print(k++);
					flag=false;
				}else {
					System.out.print(" ");
					flag=true;
				}
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
