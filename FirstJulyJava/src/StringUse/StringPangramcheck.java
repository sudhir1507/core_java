package StringUse;

import java.util.Scanner;

public class StringPangramcheck {
	public static void pangramcheck(String str) {
		str=str.toLowerCase();
		boolean ispangram=true;
		for(char c='a';c<='z';c++) {
			if(!str.contains(str.valueOf(c))) {
				ispangram=false;
				break;
			}
				
		}
		if(ispangram) {
			System.out.println("String is pangram");
		}else {
			System.out.println("String is NOT pangram");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string ");
		String str=sc.nextLine();
		pangramcheck(str);
		sc.close();
	}

}
