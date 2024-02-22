package regex;

public class Regex_Execercise1 {

	public static void main(String[] args) {
		/*
		 * create a regex pattern to represent following web site
		 * www.dezlearn.com
		 * www.dezlearn.us
		 * www.dez.com
		 * www.dez.us
		 */
		String patt="www\\.(dez|learn)\\.(com|us)";
		
		String str1="www.dez.com";
		
		System.out.println(str1.matches(patt));

	}

}
