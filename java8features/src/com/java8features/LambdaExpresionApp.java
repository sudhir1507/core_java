package com.java8features;
interface FunctionalInterface{
	void abstractFun(int n);
	default void show() {
		System.out.println("this is default method");
	}
}
public class LambdaExpresionApp {

	public static void main(String[] args) {
		FunctionalInterface obj=(n)->{
			System.out.println(n);
		};
		obj.abstractFun(10);

	}

}
