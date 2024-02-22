package javapractical;

import java.util.Scanner;
class Reverse
{
	String str;
	
	void setReverse(String str)
	{
		this.str=str;
	}
	void showReverse()
	{   char ch[]=str.toCharArray();
		int len=ch.length;
		int end=len-1;
		int mid=len/2;
		for (int i = 0; i < mid; i++)
		{
			char temp=ch[i];
			   ch[i]=ch[end];
			   ch[end]= temp;
			end--;
		}
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
	     }	
	}
	void wordReverse() {
		
	}
}

public class StringReverseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("enter the string");
		String str=xyz.nextLine();
	    
		Reverse obj=new Reverse();
		
		obj.setReverse(str);
		obj.showReverse();
		obj.wordReverse();
		
	}

}
