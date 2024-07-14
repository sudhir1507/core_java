package javaStrings;

public class MissingElement {

	public static void main(String[] args) {
		int a[]=new int[] {1,4,6,8,12};
		for(int i=0;i<a.length-1;i++) {
			
				if(a[i+1]-a[i]>1) {
					for(int k=a[i]+1;k<a[i+1];) {
						System.out.print(k++ +" ");
					}
			}
		}
	}
}
