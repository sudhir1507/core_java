package Day4;

import java.util.Scanner;

public class SubStringApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter Sub string to Search");
		String s=sc.nextLine();
		int index=str.indexOf(s);
		if(index!=-1) {
			System.out.println("SubString present is the given String");
		}else {
			System.out.println("SubString is NOT presenet in the given String");
		}

	}

}
