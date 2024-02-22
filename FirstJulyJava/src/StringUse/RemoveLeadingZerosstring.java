package StringUse;

import java.util.Scanner;

public class RemoveLeadingZerosstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.nextLine();
		String st="";
		int idx=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c!='0') {
				idx=i;    //when c is equal to any non zero number then idx=i
				break;
			}
		}
		st=str.substring(idx,str.length());
		System.out.println(st);
		sc.close();
	}

}
