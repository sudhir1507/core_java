package treeSet;
import java.util.*;
public class DecendingSet {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(10);
		set.add(40);
		set.add(20);
		set.add(50);
		set.add(30);
		
		for(Object obj:set) {
			System.out.println(obj);
		}
		System.out.println("Decending order");
		NavigableSet it=set.descendingSet();
	    for(Object o:it) {
	    	System.out.println(o);
	    }
		
		
	}

}
