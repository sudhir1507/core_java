package StringUse;

import java.util.Scanner;
class DigitSum{
	public void getSum(String str) {
		char c[]=str.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>=48&&c[i]<=57) {
				sum=sum+(char)(c[i]-48);
			}
		}
		System.out.println("Sum is "+sum);
	}
}
public class StringDigitSeparate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		DigitSum ds=new DigitSum();
		ds.getSum(str);
		

	}

}
