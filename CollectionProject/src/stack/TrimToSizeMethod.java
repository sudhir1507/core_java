package stack;
import java.util.*;
public class TrimToSizeMethod {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(20);
		s.push(40);
		s.push(60);
		s.push(80); 
		System.out.println(s);
		s.set(2, 100);
		System.out.println(s);
		System.out.println("Capacity of stack "+s.capacity());
		s.ensureCapacity(15);
		System.out.println("Capacity of stack after ensureCapcity "+s.capacity());
	    s.trimToSize();
		System.out.println("after TrimToSize method capacity " +s.capacity());

	}

}
