package com.java8features;
interface Abc{
	void show();
	public static void display() {
		System.out.println("Static method called");
	}
    default void printmethod() {
    	System.out.println("default method called");
    }
}
class Abcchild implements Abc{

	@Override
	public void show() {
		System.out.println("abstract method called");
		
	}
	
}
public class StaticDefaultApp  {

	public static void main(String[] args) {
		Abcchild a=new Abcchild();
		a.show();
		Abc.display();
		a.printmethod();
		
	}

}
