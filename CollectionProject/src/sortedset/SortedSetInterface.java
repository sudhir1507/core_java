package sortedset;
import java.util.*;

import linkedlist.DecendingOrderlist;
public class SortedSetInterface {

	public static void main(String[] args) {
		SortedSet set=new TreeSet();
		set.add(34);
		set.add(344);
		set.add(10);
		set.add(1);
		set.add(40);
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
