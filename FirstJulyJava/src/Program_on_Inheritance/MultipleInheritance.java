package Program_on_Inheritance;
interface A{
	void show();
}
interface B{
	void show();
}
class C{
	void show() {
		System.out.println("This is show method of class C");
	}
}
class D extends C implements A,B{
	public void show() {
		System.out.println("This is show of class D");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		D obj=new D();
		obj.show();

	}

}
