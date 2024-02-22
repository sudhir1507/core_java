package Interface;
interface Showable{
	void show();
	 static void display() {
		System.out.println("THis is static method..");
	}
	default void print() {
		System.out.println("this is default method..");
	}
}
class Show implements Showable{
	public void show() {
		System.out.println("This is interface method..");
	}
}
public class DefaultStaticInterfaceMethodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showable ss=new Show();
		ss.show();
		ss.print();
		Showable.display();
	}

}
