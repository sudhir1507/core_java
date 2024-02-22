package regex;

public class Intro {

	public static void main(String[] args) {
		/*
		 * what is regular expression
		 * A regular expression defines a search pattern for string
		 * the pattern can be a simple character, a fixed string or a
		 * complex expression containing special characters, numbers etc.
		 */
		String str1="+1-678-8*&53-(46+73)";
		String str2=str1.replace("+", "").replace("-", "").replace("(", "").replace(")","");
		System.out.println(str2);
		
		//using regex
		String patt="[^A-Za-z0-9]";
		String str3=str1.replaceAll(patt, "");
		System.out.println(str3);
	}

}
