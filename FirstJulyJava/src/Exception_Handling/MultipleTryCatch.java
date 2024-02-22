package Exception_Handling;



public class MultipleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[9]=3;
			System.out.println("This is Array..");
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception....");
		}catch(NumberFormatException e) {
			System.out.println("Number format Exception..");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds..");
		}catch(Exception e) {
			System.out.println("Parent Exception..");
		}finally {
			System.out.println("All is Well..");
		}
	}

}
