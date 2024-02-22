package collection;
import java.util.*;
public class CollectionString {

	public static void main(String[] args) {
		Collection ll=new LinkedList();
		ll.add("abc");
		ll.add("efg");
		ll.add("hij");
		ll.add("klm");
		
		Iterator ii=ll.iterator();
		while(ii.hasNext()) {
			Object obj=ii.next();
			System.out.println(obj);
		}

	}

}
