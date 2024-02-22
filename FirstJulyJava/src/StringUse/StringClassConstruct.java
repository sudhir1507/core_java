package StringUse;

import java.nio.charset.Charset;

public class StringClassConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byte_arr[]=new byte[] {65,66,67,68,69,70,71,72}; //using byte array
		String str=new String(byte_arr);
		System.out.println(str);
		
		Charset cs=Charset.defaultCharset();  //using byte array and default charset
		String str1=new String(byte_arr,cs);
		System.out.println(str1);
		
		String str2=new String(byte_arr,1,3); //using byte arr with start index and array length
		System.out.println(str2);
		
		String str3=new String(byte_arr,2,4,cs);  //using byte arr with start index and array length and default charset
		System.out.println(str3);
		
		char ch[]=new char[] {'a','b','c','d','e','f','g','h'};  //using char array
		String str4=new String(ch);
		System.out.println(str4);
		
		String str5=new String(ch,2,5); //using char array , start index and count i.e  count characters from the start_index.
		System.out.println(str5);
		
		int[] uni_code={65,66,67,68,69,70,71,72}; //using unicode and start index and count
		String str6=new String(uni_code,2,4);
		System.out.println(str6);
		
		StringBuffer s=new StringBuffer("JAVA");  //using StringBuffer class
		String str7=new String(s);
		System.out.println(str7);
		
		StringBuilder s2=new StringBuilder("HELLO");  //using StringBuffer
		String str8=new String(s2);
		System.out.println(str8);
		
		
		
	}

}
