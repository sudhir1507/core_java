package regex;

public class Or_Operator {

	public static void main(String[] args) {
		String patt="a(b|c|d|xyz|123)";
		String str1="a123";
		System.out.println(str1.matches(patt));

	}

}
