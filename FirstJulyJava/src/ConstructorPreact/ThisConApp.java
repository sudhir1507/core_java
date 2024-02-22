package ConstructorPreact;
class ThisApp{
	public ThisApp() {
		this(3);			//constructor chaining
		System.out.println("this is default cons");
	}
	public ThisApp(int i) {
		this(4.5f);
		System.out.println("This is integer param cons");
	}
	public ThisApp(float ff) {
		System.out.println("This is Float param cons");
	}
}
public class ThisConApp {

	public static void main(String[] args) {
		ThisApp TA=new ThisApp();

	}

}
