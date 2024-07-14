package com.java8features;
interface InnerClass{
	void show();
}
public class AnonymusClassApp {

	public static void main(String[] args) {
		InnerClass obj=new InnerClass() {
			
			@Override
			public void show() {
				System.out.println("This is show method");
			}
		};
		obj.show();
	}

}
