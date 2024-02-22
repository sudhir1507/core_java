package Coding;

public class MaxMinChar {

	public static void main(String[] args) {
		int min,max,i,j;
		String str="grass is greener on the other side";
		int freq[]= new int[str.length()]; 
		char maxchar=str.charAt(0),minchar=str.charAt(0);
		char[] string=str.toCharArray();
		for(i=0;i<string.length;i++) {
			freq[i]=1;
			for(j=i+1;j<string.length;j++) {
				if(string[i]==string[j]&&string[i]!=' '&&string[i]!='0') {
					freq[i]++;
					string[j]='0';
				}
			}
		}
		max=min=freq[0];
		for(i=0;i<freq.length;i++) {
			if(max<freq[i]&&freq[i]!='0') {
				max=freq[i];
				maxchar=string[i];
			}
			if(min>freq[i]) {
				min=freq[i];
				minchar=string[i];
			}
		}
		System.out.println(maxchar);
		System.out.println(minchar);
	}

}
