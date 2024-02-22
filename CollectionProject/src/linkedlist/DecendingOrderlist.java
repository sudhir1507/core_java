package linkedlist;
import java.util.*;
public class DecendingOrderlist {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		Iterator i=list.descendingIterator();
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}
	}

}
