package Coding;

import java.util.Arrays;

public class Genral {

	public static void main(String[] args) {
		String str1="Care is nott carr";
		char[] ch=str1.toCharArray();
		int count;
		for(int i=0;i<str1.length();i++) {
			count =1;
			for(int j=i+1;j<str1.length();j++) {
				if(ch[i]==ch[j]&&ch[i]!=' ') {
					count++;
					ch[j]='0';
				}
			}
			if(count>1&&ch[i]!='0') {
				System.out.println(ch[i]);
			}
		}
		
		
	}
		
}
