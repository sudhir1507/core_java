package Exception_Handling;

public class NestedtryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				try {
					int a[]= {1,2,4,5};
					System.out.println(a[6]);
				}catch(ArithmeticException e) {
					System.out.println("handled by Inner try block 2..");
				}
			}catch(ArithmeticException e) {
				System.out.println("Handled by inner try block 1..");
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Array Element not available..");
		}
		catch(Exception e) {
			System.out.println("handled by  Parent exception ");
		}
	}

}
