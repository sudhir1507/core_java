package Exception_Handling;

import java.util.Scanner;

public class IoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner("Hello Coder");
		System.out.println("" + scan.nextLine());
		System.out.println("Exception output "+ scan.ioException());
		scan.close();
	}

}
