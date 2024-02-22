package Coding;

public class IsStringPalindrome {

	public static void main(String[] args) {
		String str="kadak";
		StringBuffer buffer=new StringBuffer(str);
		buffer.reverse();
		String data=buffer.toString();
		if(str.equals(data)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
	}

}
