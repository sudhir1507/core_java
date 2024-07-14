package javaStrings;
class EvenExpApp extends ArithmeticException{
	public String getError() {
		return "EVEN number Exception";
	}
}
public class EvenExceptionApp {
	
	public static void EvenCheck(int no) {
		if(no%2==0) {
			throw new EvenExpApp();
		}
	}

	public static void main(String[] args) {
		try {
			int no=2;
			EvenCheck(no);
			System.out.println(no+" is odd number");
		}catch(EvenExpApp e) {
			System.out.println(e.getError());
		}
		

	}

}
