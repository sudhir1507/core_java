package collection;
import java.util.*;
public class Method_containsAll {

	public static void main(String[] args) {
		Collection ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		List ll1=new LinkedList();
		ll1.add(10);
		ll1.add(20);
		boolean b=ll.containsAll(ll1);
		if(b) {
			System.out.println("Yes all contain");
		}else {
			System.out.println("Not Contains..");
		}
	}

}
