package innerClasses;
class Outer1{
	int i;
	public void outer() {
//		int x=10;  //non final local variable of outer class method can not accessible inside inner class before jdk1.7 but
		//jdk1.9 it is working
		final int x=10;  //this is before jdk1.7
		System.out.println("Inside Outer...");
		class Inner1{
			public void inner(){
				System.out.println("inner x : "+x);
			}
		}
		Inner1 in=new Inner1();
		in.inner();
	}
}
public class LocalInnerClassApp {

	public static void main(String[] args) {
		Outer1 obj=new Outer1();
		obj.outer();
	}

}
