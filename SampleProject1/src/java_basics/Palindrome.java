package java_basics;

public class Palindrome {

	public static void main(String[] args) {
//		String str="rdar";
//		String reverse="";
//		int stringlen=str.length();
//		for(int i=(stringlen-1);i>=0;i--) {
//			reverse=reverse+str.charAt(i);
//		}
//		if(str.toLowerCase().equals(reverse.toLowerCase())) {
//			System.out.println("string is palindrome");
//		}else {
//			System.out.println("string is not palindrome");
//		}
		
		int num=3253;
		int reversnum=0;
		int remainder;
		int orignalnum=num;
		while(num!=0) {
			remainder=num%10;
			reversnum=reversnum*10+remainder;
			num/=10;
					
		}
		if(orignalnum==reversnum) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not palindrome number");
		}
		
	}

}
