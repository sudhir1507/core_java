package PracticeJava;
class A{
	int id;   //this need to be used
//	static int id;
	public void set(int id) {
		this.id=id;
	}
	public void show() {
		System.out.println(id);
	}
}
public class DemoApplication {

	public static void main(String[] args) {
		A a=new A();
		a.set(12);
		a.show();

	}

}
