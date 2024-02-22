package string_operations;

public class String_Compsrison {

	public static void main(String[] args) {
		String str1="ABCDE";
		String str2="ABcDE";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
	}

}
