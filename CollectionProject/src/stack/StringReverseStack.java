package stack;
import java.util.*;
public class StringReverseStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		Stack st=new Stack();
		 
		char[] ch=str.toCharArray();
		for(char c:ch) {
			st.push(c);
		}
		String temp="";
		while(!st.isEmpty()) {
			temp=temp+st.pop();
		}
		System.out.println("Reverse string "+temp);
	}

}
