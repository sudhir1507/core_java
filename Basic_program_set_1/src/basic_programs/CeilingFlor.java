package basic_programs;

import java.util.Scanner;

public class CeilingFlor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<=10;i++) {
			int c=-1,f=-1;
			for(int j=0;j<a.length;j++) {
				if(a[j]==i) {
					c=a[j];
					f=a[j];
					break;
				}else if(i<=a[j]) {
					c=a[j];
					break;
				}else if(i>=a[j]) {
					f=a[j];
					
				}
			}
			System.out.println("Number "+ i +" ceiling "+c+" floor "+f);
		}

	}

}
