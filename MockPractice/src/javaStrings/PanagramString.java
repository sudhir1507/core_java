package javaStrings;

import java.util.Scanner;
class Pangram{
	public boolean panagramCheck(String str) {
		boolean ispanagram=true;
		str=str.toLowerCase();
		for(char ch='a';ch<='z';ch++) {
			if(!str.contains(str.valueOf(ch))) {
				ispanagram=false;
			}
			
		}
		return ispanagram;
	}
}
public class PanagramString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		Pangram p=new Pangram();
		if(p.panagramCheck(str)) {
			System.out.println("String is panagram ");
		}else {
			System.out.println("Not panagram");
		}
		

	}

}
