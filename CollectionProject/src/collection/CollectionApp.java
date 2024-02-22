package collection;

import java.util.*;

public class CollectionApp {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		Iterator i=al.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}
		
		System.out.println("--------------");
		System.out.println("Size of arraylist "+al.size());

		
		
	}

}
