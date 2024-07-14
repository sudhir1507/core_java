package com.functional;
@FunctionalInterface
interface Abc{
	public void show();
//	public void show1();
}
public class FunctionalInterApp {

	public static void main(String[] args) {
		Abc a=new Abc() {
			public void show() {
				System.out.println("this is show method");
			}
		};
		a.show();
	}

}
