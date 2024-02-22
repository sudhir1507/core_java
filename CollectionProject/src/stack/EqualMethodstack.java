package stack;

import java.util.Stack;

public class EqualMethodstack {

	public static void main(String[] args) {
		Stack s=new Stack();
		
		s.push(40);
		s.push(60);
		
		
		Stack s1=new Stack();
		s1.push(40);
		s1.push(60);
		s1.push(10);
		if(s.equals(s1))
		    System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
