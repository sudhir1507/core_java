package Exception_Handling;

public class StringIndexOutOFBoundDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a="This is java coding";
			char c=a.charAt(20);
			System.out.println(c);
		}catch(StringIndexOutOfBoundsException ex) {
			System.out.println("StringIndexOutOfBoundsException...");
		}
	}

}
