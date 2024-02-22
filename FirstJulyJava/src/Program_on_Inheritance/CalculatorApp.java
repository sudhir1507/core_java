package Program_on_Inheritance;
abstract class Value{
	protected int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	abstract void performCalculation();
}
class Add extends Value{
	public void performCalculation() {
		System.out.println("Addition is : "+(a+b));
	}
}
class Mul extends Value{
	public void performCalculation() {
		System.out.println("Multiplication is : "+(a*b));
	}
}
class Div extends Value{
	public void performCalculation() {
		System.out.println("Division is : "+(a/b));
	}
}
class Sub extends Value{
	public void performCalculation() {
		System.out.println("Substrction is : "+(a-b));
	}
}
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj1=new Add();
		obj1.setValue(10, 5);
		obj1.performCalculation();
		
		

	}

}
