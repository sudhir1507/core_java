package javaStrings;

import java.util.Scanner;

public class MaxRepetativeCharApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		
		for(int i=0;i<c.length-1;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		int count=1,i=0,max=0;
		char ch=0;
		for(i=0;i<c.length-1;i++) {
			if(c[i]==c[i+1]) {
				count++;
			}else {
				if(count>max) {
					max=count;
				    ch=c[i];
				}
				count=1;
			}
			
		}
		char tch=c[i];
		if(count>max) {
			System.out.println("maximum repeatative char "+tch);
		}else {
			System.out.println("maximum repeatative char "+ch);
		}
	}

}
