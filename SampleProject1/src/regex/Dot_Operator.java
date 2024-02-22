package regex;
// DOT (.)-- matches any single character
public class Dot_Operator {

	public static void main(String[] args) {
		String patt="ABC.";
		String str1="ABC9";
		String patt1="ABC.*";
		String str2="ABC8734*@#$%";
		System.out.println(str1.matches(patt));
		System.out.println(str2.matches(patt1));
		

	}

}
