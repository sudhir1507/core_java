package JavaPack;
abstract class Human{
	public abstract void eat();
	public void walk() {
		
	}
}

class Man extends Human{
	public void eat() {
		System.out.println("eating ");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj=new Man();
		obj.eat();

	}

}
