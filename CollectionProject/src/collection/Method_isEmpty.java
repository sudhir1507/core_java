package collection;

import java.util.*;

public class Method_isEmpty {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(12);
		ll.add(22);
		ll.add(32);
		ll.add(42);
		
		boolean b=ll.isEmpty();
		if(!b) {
			System.out.println("Collection is not empty..");
		}else {
			System.out.println("Collection is  empty..");
		}	
		
	}

}
