package Overriding;
class A{
	public void show() {
		System.out.println("show in parent");
	}
}
class B extends A{
	public void show() {
		System.out.println("show in child");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.show();
	}

}
