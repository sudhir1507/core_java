package Coding;

import java.util.Scanner;

public class Gardan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xx,yy;
		System.out.println("Enter the value of xx and yy");
		Scanner sc=new Scanner(System.in);
		xx=sc.nextInt();
		yy=sc.nextInt();
		if(xx>=yy) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}
