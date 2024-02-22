package basic_programs;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int a[]=new int[size];
	    System.out.println("Enter the array Elements ");
	    for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
	    System.out.println("Array Elements ");
	    for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
        for(int i=0;i<a.length-1;i++) {
        	int count=1;
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]==a[j]) {
        			count++;
        		}
        	}
        	if(count>a.length/2) {
        		System.out.println("\nMajority Element is "+a[i]);
        	}
        }
	    
	}

}
