package JavaPack;
class Outer{
	public void show() {
		
	}
	static class Inner{
		public void display() {
			System.out.println("in a display");
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.show();
		
		Outer.Inner obj1=new Outer.Inner();
		obj1.display();
	}

}
