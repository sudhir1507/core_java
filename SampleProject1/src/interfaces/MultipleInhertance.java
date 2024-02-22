package interfaces;

import super_keyword.A;

//interface Demo{
//	void abc();
//	default void show() {
//		System.out.println("in show");
//	}
//}
//class Demoimp implements Demo{
//	public void abc() {
//		System.out.println("in abc");
//	}
//	public void show() {
//		System.out.println("in new show");
//	}
//}
class Animal{
	public void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("barking");
	}
}
class Cat extends Animal{
	public void meow() {
		System.out.println("meowing");
	}
}

public class MultipleInhertance {

	public static void main(String[] args) {
//		Demo obj=new Demoimp();
//		obj.abc();
//		obj.show();
		Cat obj=new Cat();
		obj.eat();
		obj.meow();
	}

}
