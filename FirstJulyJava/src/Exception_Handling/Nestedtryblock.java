package Exception_Handling;

public class Nestedtryblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//inner block 1
			try {
				int a=2,b=0;
				System.out.println(a/b);
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception..");
			}
			
			//inner block 2
			try {
				String str=null;
				System.out.println(str.length());
			}catch(NullPointerException e) {
				System.out.println("Null pointer exception..");
			}
			System.out.println("All inner exceptions handled..");
		}catch(Exception e) {
			System.out.println("Handled exception in outer catch..");
			
		}
		System.out.println("Normal Flow of program..");
	}

}
