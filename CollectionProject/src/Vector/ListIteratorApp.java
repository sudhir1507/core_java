package Vector;
import java.util.*;
public class ListIteratorApp {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		v.add(600);
		
//		ListIterator i=v.listIterator(v.size());
//		while(i.hasPrevious()) {
//			Object obj=i.previous();
//			System.out.println(obj);
//		}
//		ListIterator li=v.listIterator();
//		while(li.hasNext()) {
//			Object obj=li.next();
//			if((int)li.next()==400) {
//				li.set(4);
//			}
////			System.out.println(obj);
//		}
//		System.out.println(v);
		for(int i=0;i<v.size();i++) {
			Object obj=v.get(i);
			System.out.println(obj);
		}
	}

}
