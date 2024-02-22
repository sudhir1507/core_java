package Exception_Handling;

public class ExceptionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}

}
/*This method prints exception information in the format
 *  of the Name of
 
 *  the exception: description of the exception, stack trace.
 */