package Coding;

public class DuplicateChar {

	public static void main(String[] args) {
		String str="jaava is bestt langg";
		int count;
		char str1[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			count=1;
			for(int j=i+1;j<str.length();j++) {
				if(str1[i]==str1[j]&&str1[i]!=' ') {
					count++;
					str1[j]='0';					
				}	
			}
			if(count>1&&str1[i]!='0') {
				System.out.println(str1[i]);
			}
		}
	}
}
