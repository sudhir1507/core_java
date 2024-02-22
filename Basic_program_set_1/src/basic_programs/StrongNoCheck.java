package basic_programs;

import java.util.Scanner;

public class StrongNoCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int no=sc.nextInt();
		int rem,sum=0,temp;
		temp=no;
		while(no!=0) {
			rem=no%10;
			int f=1;
			for(int j=1;j<=rem;j++) {
				f=f*j;
			}
			sum=sum+f;
			no/=10;
		}
      if(sum==temp) {
    	  System.out.println("Strong number");
      }else {
    	  System.out.println("NOT strong number");
      }
	}

}
