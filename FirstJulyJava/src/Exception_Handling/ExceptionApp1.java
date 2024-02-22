package Exception_Handling;

public class ExceptionApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println(e.toString());
		}
	}

}
/*The toString() method prints exception information
 *  in the format of the Name of the exception: description 
 *  of the exception.
 * 
 */