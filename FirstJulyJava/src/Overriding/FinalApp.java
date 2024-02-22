package Overriding;
class FDemo{
	public void disp() {
		System.out.println("Hi this display");
	}
}
final class Finaldemo extends FDemo{
	public void show() {
		System.out.println("Hi this show");
	}
}
public class FinalApp {

	public static void main(String[] args) {
		Finaldemo fd=new Finaldemo();
		fd.disp();
		fd.show();

	}

}
