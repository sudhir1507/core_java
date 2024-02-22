package Abstraction;
abstract class Demo{
	public abstract void demo();
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo() {
				   public void demo() {
					   System.out.println("This is object of abstract class");
				   }
		        };
		    d.demo();
	}

}
