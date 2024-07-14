package Vector;

import java.util.*;

public class ListIteratorAppClass {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		ListIterator li=v.listIterator(v.size());
		while(li.hasPrevious()) {
			Object obj=li.previous();
			if((int)obj==300) {
				li.set(30000);
			}
		}
		System.out.println("vector after set "+v);

	}

}
