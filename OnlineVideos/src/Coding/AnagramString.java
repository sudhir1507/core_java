package Coding;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1="race";
		String str2="care";
		str1.toLowerCase();
		str2.toLowerCase();
		if(str1.length()==str2.length()) {
			char[] string1=str1.toCharArray();
			char[] string2=str2.toCharArray();
			 Arrays.sort(string1);
			 Arrays.sort(string2);
			 boolean result=Arrays.equals(string1, string2);
			 if(result) {
				 System.out.println("String are anagram");
			 }else {
				 System.out.println("String are not anagram");
			 }
			
		}else {
			System.out.println("Both strings are not  anagrams");
			 
		}

	}

}
