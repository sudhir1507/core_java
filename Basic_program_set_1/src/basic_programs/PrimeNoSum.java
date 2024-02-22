package basic_programs;

import java.util.Scanner;

public class PrimeNoSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int limit=sc.nextInt();
		int sum=0;
		for(int i=2;i<=limit;i++) {
			int no=i;
			int count=1;
			for(int j=2;j<no;j++) {
				if(no%j==0) {
					count++;
				}
			}
			if(count==1) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of Prime numbers :"+sum);

	}

}
