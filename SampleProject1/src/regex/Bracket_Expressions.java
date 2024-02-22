package regex;

public class Bracket_Expressions {

	public static void main(String[] args) {
		/*
		 * Adding literals in bracket [aeiou]
		 * Adding ranges in bracket [A-Z0-9]
		 * usege of '^' in bracket [^a-z]
		 */
		String patt="[^A-Z]at";
		String str1="Tat";
		
		System.out.println(str1.matches(patt));
		
	}

}
