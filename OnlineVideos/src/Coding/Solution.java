package Coding;

import java.security.PublicKey;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		String str1="race is hare";
		char[] ch=str1.toCharArray();
		boolean foundspace=true;
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				if(foundspace) {
					ch[i]=Character.toUpperCase(ch[i]);
					foundspace=false;
				}
			}else {
				foundspace=true;
			}
		}
		
	 str1=String.valueOf(ch);
	 System.out.println(str1);
		
	}
}	



