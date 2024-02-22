package whats_new_in_java10;

import java.util.Scanner;
//Var cannot be used to declare class level variable
//argument variable and for array
public class Var_Keyword {

	public static void main(String[] args) {
		var num1=2;
		var str1="abc";

		
		Scanner s1= new Scanner(System.in);
		
		var s2= new Scanner(System.in);
		
		int x=add(100,200);
		var y=add(200,400);
	}
	public static int add(int a, int b) {
		return a+b;
	}
}
