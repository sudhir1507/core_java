package sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeadSetMethod {

	public static void main(String[] args) {
		SortedSet set=new TreeSet();
		
		set.add(34);
		set.add(344);
		set.add(10);
		set.add(1);
		set.add(40);
		
		//System.out.println(set.headSet(40));
		System.out.println("tailset method "+set.tailSet(34));
		System.out.println("subset method "+set.subSet(10, 40));
		
	}

}
