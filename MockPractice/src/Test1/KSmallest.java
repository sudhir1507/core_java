package Test1;

import java.util.Scanner;

public class KSmallest {

	public static void main(String[] args) {
		int a[]=new int[] {11,2,3,63,2,7,98,3};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int len=a.length-1;
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]==a[j]) {
					for(int k=j;k<len-1;k++) {
						a[k]=a[k+1];
					}
					j--;
					len--;
				}
			}
		}
		for(int i=0;i<len;i++) {
			System.out.print(a[i]+"\t");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter k th smallest number you want");
		int n=sc.nextInt();
		System.out.println(n+"th smallest element is "+a[n-1]);
	}

}
