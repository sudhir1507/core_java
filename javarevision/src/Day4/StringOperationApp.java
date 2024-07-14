package Day4;

import java.util.Iterator;
import java.util.Scanner;

public class StringOperationApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		do {
			System.out.println("1.Length of string");
			System.out.println("2.count vowel and consonent of string");
			System.out.println("3.count words of string");
			System.out.println("4.alphabet, digit, symbols of string");
			System.out.println("Enter choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("length of string "+str.length());
				break;
			case 2:
				int vcount=0,ccount=0;
				String s=str.toLowerCase();
				char c[]=s.toCharArray();
				for(int i=0;i<c.length;i++) {
					if((c[i]>=97&&c[i]<=122)) {
						if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
							vcount++;
						}else {
							ccount++;
						}
					}
				}
				System.out.println("Number of vowels in String "+vcount);
				System.out.println("Number of vowels in String "+ccount);
				break;
			case 3:
				int wcount=0;
				String words[]=str.split(" ");
				for (int i = 0; i < words.length; i++) {
					wcount++;
				}
				System.out.println("Number of Words "+wcount);
				break;
			case 4:
				int acount=0,dcount=0,scount=0;
				String st=str.toLowerCase();
				char ch[]=st.toCharArray();
				for(int i=0;i<ch.length;i++) {
					if((ch[i]>=97&&ch[i]<=122)) {
						acount++;
					}else if(ch[i]>=48&&ch[i]<=57) {
						dcount++;
					}else {
						scount++;
					}
				}
				System.out.println("Number of alphabets "+acount);
				System.out.println("Number of Digits "+dcount);
				System.out.println("Number of Special symbols "+scount);
				break;
			default:
				System.out.println("Worng choice");
			}
		}while(true);

	}

}
