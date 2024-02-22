package JavaPack;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			int i=6;
			int j=2;
			int k=i/j;
			int a[]=new int[5];
			a[5]=77;
			System.out.println("Output is : "+k);
	}catch(ArithmeticException e){
		System.out.println("Cannot divide by zero ");
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array is full");
	}
		finally {
			System.out.println("Bye");
		}
	}
}
