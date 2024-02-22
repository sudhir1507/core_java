package exceptions;

import java.io.FileInputStream;

public class CheckedVsUnchecked {

	public static void main(String[] args) {
		/*
		 * checked exceptions: checked at complie-time
		 * e.g. IOExcpetion, SQLExceptions
		 * 
		 * Unchecked exceptions (runtime exception ) checked at run-time
		 * e.g . ArithmaticException, ArrayOutOfBoundsException etc
		 * 
		 * 
		 */
		//FileInputStream x= new FileInputStream("Users\\ACER\\Desktop\\gitignore");
		
		System.out.println(100/0);
		
	}

}
