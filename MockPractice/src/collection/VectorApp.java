package collection;
import java.util.*;
public class VectorApp {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(10);
		v.add(40);
		v.add(70);
		v.add(20);
		
//		for(Object o:v) {
//			System.out.println(o);
//		}
		Iterator it=v.iterator();
//		while(it.hasNext()) {
//			Object o=it.next();
//			System.out.println(o);
//		}
//		Enumeration e=v.elements();
//		while(e.hasMoreElements()) {
//			Object o=e.nextElement();
//			System.out.println(o);
//		}
		ListIterator li=v.listIterator(v.size());
		while(li.hasPrevious()) {
			Object o=li.previous();
			System.out.println(o);
		}
		
		}

}
