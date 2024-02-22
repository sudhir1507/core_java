package set;

import java.util.*;

public class ContainsAllMethod {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(20);
		s.add("Abc");
		
		s.add(new Date());
		s.add(23.4f);
		s.add(23.34);
		s.add(true);
		
		Collection c=new ArrayList();
		c.add(20);
		c.add("Abc");
		c.add(true);
		System.out.println("hashcode of set s "+s.hashCode());
		if(s.containsAll(c)) {
			System.out.println("all present");
		}else {
			System.out.println("Not present");
		}
		
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
