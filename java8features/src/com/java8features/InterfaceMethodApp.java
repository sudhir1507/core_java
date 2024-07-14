package com.java8features;
 
interface MethodDemo{
	static void show() {
		System.out.println("this is static method");
	}
	default void display() {
		System.out.println("This is default method");
	}
	void get();
	
}
class ImplDemo implements MethodDemo{

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceMethodApp {

	public static void main(String[] args) {
		MethodDemo.show();
		MethodDemo obj=new ImplDemo();
		obj.display();
	}

}
