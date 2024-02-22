package collection;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		Collection al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(700);
		al.add(800);
		
		ArrayList al1=new ArrayList();
		al1.addAll(al);
		Iterator i=al1.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}
		System.out.println("size is "+al1.size());
		if(al1.containsAll(al)) {
			System.out.println("found");
		}else {
			System.out.println("Not found");
		}
		System.out.println("size "+al1.size());
		al1.clear();
//		boolean b=al.remove(300);
//		if(b) {
//			System.out.println("Success..");
//		}else {
//			System.out.println("Not Removed..");
//		}
//		System.out.println(al);
		System.out.println("size "+al1.size());
	}

}
