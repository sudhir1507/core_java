package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * create a regex pattern to extract all prices from a string
 * e.g. "Your total cost is $24.99 after $0.99 sale discount and $12.09 coupon1 
 * discount and $0.00 coupon2 discount"
 * regex pattern should be able to match all prices from the above string. 
 */
public class Regex_Execercise2 {

	public static void main(String[] args) {
		String str1="Your total cost is $22324.9239 after $012.23333333399 sale discount and $1.0329 coupon1 discount and $023.0320 coupon2 discount";
		String patt="\\${1}\\d{1,}\\.\\d{1,}";
		
		Pattern p = Pattern.compile(patt);
		Matcher m=p.matcher(str1);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
