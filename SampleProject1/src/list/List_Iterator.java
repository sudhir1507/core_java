package list;
/*
 * list iterator is used when we want to enumerate elements of list
 * it can be used both on arraylist and linkedlist
 */
import java.util.ArrayList;
import java.util.ListIterator;
public class List_Iterator {

	public static void main(String[] args) {
		var list = new ArrayList<Double>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		list.add(1.6);
		
		ListIterator itr=list.listIterator(list.size());

//		ListIterator itr=list.listIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	
	}
	

}
