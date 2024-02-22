package Exception_Handling;

public class ExceptionApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=0;
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
//the getMessage() method prints only the description of the exception.