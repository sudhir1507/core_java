package string_operations;

public class String_Replace {

	public static void main(String[] args) {
		String str1="I1234 love 1234java and Pyhton1234";
		String str2="1234";
		String str3="@";
		System.out.println(str1.replace(str2, str3));
        String str4="I@# lo[]ve *J!ava and (*)Py%(thon";
        String patt="[^A-Za-z0-9\\s]";
        System.out.println(str4.replaceAll(patt,""));
	}

}
