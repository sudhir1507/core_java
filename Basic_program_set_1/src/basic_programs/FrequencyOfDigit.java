package basic_programs;

import java.util.Scanner;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int no=sc.nextInt();
		int count=0;
		for(int i=0;i<=10;i++) {
			count=0;
			for(int j=no;j>0;j=j/10) {
				int rem=j%10;
				if(rem==i)
				   count++;
			}
			if(count>0) {
				System.out.println(i+"--->"+count);
			}
		}
	}
}
