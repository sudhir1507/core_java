package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class InexOFMethod {

	public static void main(String[] args) {
		LinkedList al=new LinkedList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
//		Object val=al.indexOf(30);
//		System.out.println(val);
		
        ListIterator i=al.listIterator(al.size()-3);
        while(i.hasPrevious()) {
        	Object obj=i.previous();
        	System.out.println(obj);
        }
	}

}
