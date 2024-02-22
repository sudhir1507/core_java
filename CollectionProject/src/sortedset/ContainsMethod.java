package sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class ContainsMethod {

	public static void main(String[] args) {
		SortedSet set=new TreeSet();
		set.add(34);
		set.add(344);
		set.add(10);
		set.add(1);
		set.add(40);
		
		if(set.contains(10))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
