package javaStrings;

public class BraccketCheck {
   public static int brackerChecker(String str) {
	   int balance=0;
	   int end=0;
	   for(int i=0;i<str.length();i++) {
		   if(str.charAt(i)=='(') {
			   balance++;
			   end++;
		   }else if(str.charAt(i)==')') {
			   balance--;
			   end++;
		   }
		   
		   if(balance==0) {
			   return end;
		   }
	   }
	   return end;
	   
   }
	public static void main(String[] args) {
		String str="((()))))(";
		System.out.println("index "+brackerChecker(str));
	}

}
