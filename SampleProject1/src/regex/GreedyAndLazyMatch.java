package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyAndLazyMatch {

	public static void main(String[] args) {
		/*
		 * * - Greedy match   *? - Non Greedy match
		 * + - Greedy match   +? - Non Greedy match
		 * {} - Greedy match  {}?- Non Greedy match
		 */
		String str1="XXjofdhYYlskdhflXXheflkhYYlkdhslXXlrhlYYjdbk";
		String patt="XX.*?YY";
		Pattern p = Pattern.compile(patt);
		Matcher m=p.matcher(str1);
		System.out.println(m.results().count());
		m.reset();
		while(m.find()) {
			System.out.println("Starts at : "+m.start());
			System.out.println(m.group());
		}
	}

}
