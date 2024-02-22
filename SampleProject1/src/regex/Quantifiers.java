package regex;

public class Quantifiers {

	public static void main(String[] args) {
		/*
		 * * - Matches 0 or more instances of preceding character
		 * + - Matches 1 or more instances of preceding character
		 * ? - Matches 0 or 1 instances of preceding character
		 * {n} - Matches exactly 'n' of instances of preceding character
		 * {n,m}- Matches minimum 'n' or maximum 'm' instances of preceding character
		 * {n,}- Matches minimum 'n' or more instances of preceding character
		 */
		String patt="abc(xyz){2,}";
		String str1="abcxyzxyzxyzxyz";
		System.out.println(str1.matches(patt));
	}

}
