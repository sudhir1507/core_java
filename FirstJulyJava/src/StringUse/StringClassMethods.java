package StringUse;

public class StringClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Hello java coder");
		System.out.println(str.length());   //string length method return no of char
		
		System.out.println(str.charAt(3));  //CharAt() method return char at specified index
		
		System.out.println(str.substring(3)); //substring() returns char from specified index to end
	
		System.out.println(str.substring(6,10));  //char between specified index
	
		System.out.println(str.concat(" Welcome"));  //concat specified string to the end of first String
	
		System.out.println(str.indexOf("java")); // return index within string first occurance  6
		
		System.out.println(str.indexOf("e",4));  // return index within string first occurance  after specified index  14
		 
		System.out.println(str.lastIndexOf("a")); //retrun last occurence index the string
		
		boolean s="hello".equals(str); //compare this string with specified object
		System.out.println(s);
		
		boolean s1="Hello java coder".equals(str);
		System.out.println(s1);
		
		boolean s3="HELLO JAVA CODER".equalsIgnoreCase(str);
		System.out.println(s3);
		
		String str1=new String("Hello java coder");
		
		int ii=str.compareTo(str1);
		System.out.println(ii);
		
		String str2=new String("Hi java coder");
		System.out.println(str.compareTo(str2));
		
		/*This returns difference s1-s2. If :
 		out < 0  // s1 comes before s2
 		out = 0  // s1 and s2 are equal.
 		out > 0   // s1 comes after s2.*/
		 
		System.out.println(str.toLowerCase());  // return lower case string
		
		System.out.println(str.toUpperCase()); //return upper case string
		
		String str4=new String("  hey coder   ");
		System.out.println(str4.trim()); //remove whitespaces at both ends
		
		String st=new String("java java");
		System.out.println(st.replace('j','l')); //replace method replace all occurrences of oldchar with newchar
		
		String ss=new String("Hello");
		System.out.println(str.contains(ss)); //return if string (str) contains the given string ss (here ture)
	
		char ch[]=ss.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		System.out.println(str.startsWith(ss)); //Return true if string starts with this prefix.
		
	}

}
