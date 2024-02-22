package regex;
/*
 * create a regex patteern to represent following number ranges
 * 0-90
 * 0-1000
 * 99-9999
 * 25-75
 * 220-240
 * 
 */
public class Number_Range {

	public static void main(String[] args) {
		String patt = "[0-9][0-9]?";
		String str="9";
		System.out.println(str.matches(patt));
		
		String patt1 = "[0-9][0-9]?[0-9]?|1000";
		String str1="0";
		System.out.println(str1.matches(patt1));
		
		String patt2 = "99|[1-9][0-9][0-9][0-9]?";
		String str2="999";
		System.out.println(str2.matches(patt2));
		
		String patt3 = "2[5-9]|[3-6]|7[0-5]";
		String str3="70";
		System.out.println(str3.matches(patt3));
		
		String patt4 = "2[2-3][0-9]|240";
		String str4="230";
		System.out.println(str4.matches(patt4));
	}

}
