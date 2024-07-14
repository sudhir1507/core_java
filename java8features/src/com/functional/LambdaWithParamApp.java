package com.functional;
interface Test4{
	boolean test(int n);
}
public class LambdaWithParamApp {
 
	public static void main(String[] args) {
		Test4 t=(n)->n%2==0;
		int n=11;
		if(t.test(n))
			System.out.println("2 is factor of "+n);
		if(!t.test(n))
			System.out.println("2 is not factor of "+n);
	}

}
