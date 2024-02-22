package stack;

import java.util.Stack;

public class RemoveAllCollectionmethod {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(20);
		s.push(40);
		s.push(60);
		s.push(80);
		s.push(100);
		
		Stack s1=new Stack();
		s1.push(40);
		s1.push(60);
		
		System.out.println("Elements of s "+s);
		s.removeAll(s1);
		System.out.println("Elements of s "+s);
	}

}
