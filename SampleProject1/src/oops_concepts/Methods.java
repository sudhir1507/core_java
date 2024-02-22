package oops_concepts;

public class Methods {

	public static void main(String[] args) {
		Methods m= new Methods();
		m.dothis();
		m.addition(100, 200);
		int x=m.multiply(20, 30);
		System.out.println(x);
	}
	public void dothis() {
		System.out.println("Do this executed");
	}
	
	public void addition(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	public int multiply(int num1, int num2) {
		int num3=num1*num2;
		return num3; 
	}
}
