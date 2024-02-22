package Program_on_Inheritance;
abstract class Animal{
	abstract void makeSound();
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Dog makes More Sound");
	}
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("Cat makes Less Sound");
	}
}
public class AnimalApp {

	public static void main(String[] args) {
		
		Dog obj=new Dog();
		obj.makeSound();
		
		Cat obj1=new Cat();
		obj1.makeSound();
	}

}
