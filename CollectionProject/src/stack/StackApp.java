package stack;
import java.util.*;
public class StackApp {

	public static void main(String[] args) {
		Stack s=new Stack();
        
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("stack size is "+s.size());
		System.out.println("stack is "+s);
		System.out.println("stack is empty? "+s.empty());
		System.out.println("===================================");
		int sum=0;
		while(!s.empty()) {
			sum+=(int)s.pop();
		}
		System.out.println("Sum is "+sum);
		System.out.println("stack is "+s.size());
		System.out.println("stack is "+s);
		System.out.println("stack is empty? "+s.empty());
	}

}
