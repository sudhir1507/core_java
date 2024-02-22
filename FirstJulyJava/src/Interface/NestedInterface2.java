package Interface;
interface Testable{
	void show();
	interface Innertest{
		void print();
	}
}
class BBB implements Testable.Innertest{
	public void print() {
		System.out.println("this is print");
	}
	void show() {
		System.out.println("this is show..");
	}
}
public class NestedInterface2 {

	public static void main(String[] args) {

//		Testable.Innertest obj=new B();
//		obj.print();
		BBB obj1=new BBB();
		obj1.show();
		obj1.print();
	}

}
