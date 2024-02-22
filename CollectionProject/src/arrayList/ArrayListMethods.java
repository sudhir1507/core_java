package arrayList;

import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		
		ArrayList a1=new ArrayList();
////		a1.add(20);
////		a1.add(30);
////		a1.add(40);
//		a1.addAll(a);
//		a1.ensureCapacity(10);
//		System.out.println(a);
//		//a.clear();
//		System.out.println(a);
//		
//		boolean b=a.containsAll(a1);
//		if(b) {
//			System.out.println("contains");
//		}else {
//			System.out.println("not contains");
//		}
		ListIterator list=a.listIterator();
		while(list.hasNext()) {
			Object obj=list.next();
			System.out.println(obj);
		}

	}

}
