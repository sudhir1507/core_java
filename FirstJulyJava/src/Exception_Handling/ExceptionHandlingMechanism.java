package Exception_Handling;

public class ExceptionHandlingMechanism {
	static int divideByZero(int a,int b) {
		int i=a/b;
		return i;
	}
	static int computeDivision(int a,int b) {
		int res=0;
		try {
			res=divideByZero(a,b);
		}catch(NumberFormatException ex){
			System.out.println("NumberFormatException is occured");
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=0;
		try {
			int result=computeDivision(a, b);
		}catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
