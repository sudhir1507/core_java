package regex;

public class Character_Classes {

	public static void main(String[] args) {
		/*
		 * \d - matches a single digit character
		 * \w - matches a single word character
		 * \s - matches a single whitespace character
		 * \D - matches a single non-digit character
		 * \W- matches a single non-digit and non-word character
		 *  
		 */
		String patt= "\\w{2,6}\\W{2}";
		String str1="Sghhhgs@#";
		
		System.out.println(str1.matches(patt));
	}

}
