package StringUse;

import java.util.Objects;

public class StringComapareEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("java");
		String str1=new String("java");
		
		System.out.println(str.equals(str1));
		
		System.out.println(str==str1);
		
		System.out.println(str.compareTo(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(Objects.equals(str, str1));
	}

}
