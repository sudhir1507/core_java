package javaStrings;

public class MaxRepeatativeCharApp {

	public static void main(String[] args) {
		String str="abcacd";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='1';
				}
			}
			if(count>1&&ch[i]!='1') {
				System.out.print(ch[i]+" ");
			}
		}
		

	}

}
