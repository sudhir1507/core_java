package PracticeJava;

import java.util.Scanner;

public class CharCheckApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter charecter to check ");
	    char c=sc.next().charAt(0);

	     if(((c>='a')&&(c<='z'))||((c>='A')&&(c<='Z'))){
		System.out.println("Charecter is alphabet "+c);
	     }
	     else if(c>='0' && c<='9'){
		System.out.println("Charecter is Digit "+c);
	     }
	     else{
	        System.out.println("Charecter is Special Symbol "+c);
	      }

	}

}
