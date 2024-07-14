package javaStrings;

import java.util.Scanner;

public class MinimumDistanceWords {

	public static void main(String[] args) {
		int min=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Strings");
		int size=sc.nextInt();
		sc.nextLine();
		String str[]=new String[size];
		System.out.println("Enter Strings");
		for(int i=0;i<size;i++) {
			str[i]=sc.nextLine();
		}
		System.out.println("Enter first String ");
		String first=sc.nextLine();
		System.out.println("Enter second String");
		String second=sc.nextLine();
		int dist=0;
        for(int i=0;i<str.length;i++) {
        	int f=0,s=0;
            if(str[i].equals(first)) {
            	f=i;
            }
            if(str[i].equals(second)) {
            	s=i;
            }
            if(f>=s)
             dist=f-s;
            else
              dist=s-f;
        }
        System.out.println("Minimum distnace is "+dist);
	}

}
