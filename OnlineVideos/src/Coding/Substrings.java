package Coding;

public class Substrings {

	public static void main(String[] args) {
		String str="Fun";
		int temp=0;
		int len=str.length();
		String str1[]=new String[len*(len-1)/2];
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				str1[temp]=str.substring(i,j+1);
				temp++;
			}
		}
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
		
	}

}
