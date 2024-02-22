package LoopingAssignment;

import java.util.Scanner;

public class PowerNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=1,base,index;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and index");
		base=sc.nextInt();
		index=sc.nextInt();
		for(int i=1;i<=index;i++) {
			p=p*base;
		}
		System.out.println("Power is "+p);
	}

}
