package StringUse;

public class StringMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HELLO ";
		
		str.concat("JAVA");
		
		System.out.println(str);        //str not changed
		
		String str1=str.concat("WORLD");
		System.out.println(str1);      //new String object created which is refered by str1
	}

}
