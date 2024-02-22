package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ToArrayMethod {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(10);
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		System.out.println(al.size());
		al.trimToSize();
		System.out.println(al.size());
		Object a[]=al.toArray();
		for(Object obj:a) {
			System.out.println(obj);
		}

	}

}
