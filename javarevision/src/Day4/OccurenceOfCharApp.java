package Day4;

import java.util.Scanner;

public class OccurenceOfCharApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		char s[]=str.toCharArray();
		for (int i = 0; i < s.length-1; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i]>s[j]) {
					char c=s[i];
					s[i]=s[j];
					s[j]=c;
				}
			}
		}
		int count=1,i;
		for(i=0;i<s.length-1;i++) {
			if(s[i]==s[i+1]) {
				count++;
			}else {
				System.out.println(s[i]+ " -----> "+count);
				count=1;
			}
		}
		System.out.println(s[i]+" -----> "+count);

	}

}
