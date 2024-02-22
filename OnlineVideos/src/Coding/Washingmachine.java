package Coding;

import java.util.Scanner;

public class Washingmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight;
		Scanner sc=new Scanner(System.in);
		weight=sc.nextInt();
		if(weight==0) {
			System.out.println("Time Estimated 0 Minutes");
		}else if(weight>0&&weight<=2000) {
			System.out.println("time estimate is 25 minutes");
		}else if(weight>=2001&&weight<=4000) {
			System.out.println("time estimate is 35 minutes");
		}else if(weight>=4001&&weight<=7000) {
			System.out.println("time estimate is 45 minutes");
		}else {
			System.out.println("INVALID INPUT");
		}
	}

}
