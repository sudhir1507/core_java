package StringUse;

public class StringMethods {

	public static void main(String[] args) {
		String s="Keep coding";
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.substring(3));
		System.out.println(s.substring(2,7));
		System.out.println(s.concat(" at the end"));
		System.out.println(s.indexOf("p"));
		System.out.println(s.compareTo("Keep Aoding"));
		System.out.println(s.compareToIgnoreCase("KEEP COding"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.toCharArray());
		System.out.println(s.contains("eep"));
		System.out.println(s.replace('c', 'Z'));
		System.out.println(s.equals("Keep oding"));
		System.out.println(s.equalsIgnoreCase("keep CODING"));
	}

}
