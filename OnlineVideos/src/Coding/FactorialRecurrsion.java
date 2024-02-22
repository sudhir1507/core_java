package Coding;

public class FactorialRecurrsion {
	static int factorial(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		int number=2;
		int fact=factorial(number);
		System.out.println(fact);
	}

}
