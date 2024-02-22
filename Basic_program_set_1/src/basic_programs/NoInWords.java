package basic_programs;

import java.util.Scanner;

public class NoInWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int no=sc.nextInt();
		int rev=0;
		while(no!=0) {
			rev=rev*10+(no%10);
			no/=10;
			
		}
		while(rev!=0) {
			int rem=rev%10;
//			if(rem==0)
//				System.out.print(" Zero ");
			switch(rem) {
			case 1:
				System.out.print(" One");
				break;
			case 2:
				System.out.print(" Two");
				break;
			case 3:
				System.out.print(" Three");
				break;
			case 4:
				System.out.print(" Four");
				break;
			case 5:
				System.out.print(" Five");
				break;
			case 6:
				System.out.print(" Six");
				break;
			case 7:
				System.out.print(" Seven");
				break;
			case 8:
				System.out.print(" Eight");
				break;
			case 9:
				System.out.print(" Nine");
				break;
			default:
				System.out.print(" Zero");	
		}
			rev=rev/10;
		}

	}

}
