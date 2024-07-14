package javaStrings;

import java.util.Scanner;

public class LongestCommanPrefix {
    public static String longestCommonString(String[] strs) {
    	if(strs==null||strs.length==0) {
    		return "";
    	}
    	String prifix=strs[0];
    	for(int i=0;i<strs.length;i++) {
    		while(!strs[i].startsWith(prifix)) {
    			prifix=prifix.substring(0,prifix.length()-1);
    			if(prifix.isEmpty()) {
    				return "";
    			}
    		}
    	}
    	return prifix;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Strings");
		int size=sc.nextInt();
		sc.nextLine();
		String str[]=new String[size];
		System.out.println("Enter Strings");
		for(int i=0;i<size;i++) {
			str[i]=sc.nextLine();
		}
    
		System.out.println(longestCommonString(str));
	}

}
