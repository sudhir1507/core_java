package Interface;

interface Adpp{
	void show();
	void display();
}
class ADP implements Adpp{
	public void show() {
	           }
	public void display() {
		       }
}
class A extends ADP{
	public void show() {
		System.out.println("Show method..");
	}
}
class B extends ADP{
	public void display() {
		System.out.println("display method..");
	}
}
public class AdapterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.show();
		B b=new B();
		b.display();
	}

}
