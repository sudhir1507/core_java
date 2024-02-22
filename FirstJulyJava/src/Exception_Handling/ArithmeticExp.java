package Exception_Handling;

public class ArithmeticExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=19;
			int b=0;
		    int c=a/b;
		    System.out.println("Result = "+c);
			
		}catch(ArithmeticException ex) {
			System.out.println("Cant divide a number by 0");
		}
	}

}
