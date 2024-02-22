package Exception_Handling;

public class NumberFormatExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num=Integer.parseInt("gajanan");
			System.out.println(num);
		}catch(NumberFormatException ne) {
			System.out.println("Number Format Exception..");
		} 
	}

}
