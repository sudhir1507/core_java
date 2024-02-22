package string_operations;

public class String_search {

	public static void main(String[] args) {
		String str1="I love Java love and Selenium";
		String str2="Java";
		System.out.println(str1.contains(str2));
		System.out.println(str1.startsWith("I"));
		System.out.println(str1.endsWith("Selenium"));
		System.out.println(str1.indexOf("love"));
		System.out.println(str1.indexOf("love", 6));
		System.out.println(str1.lastIndexOf("love"));
	}

}
