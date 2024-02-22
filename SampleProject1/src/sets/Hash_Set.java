package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {
		/*
		 * Set is a collection that cannot contain duplicate elements
		 * HashSet does not maintain insertion order
		 * no positional access of elements
		 * 
		 */
		
		var set1=new HashSet<Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(20);
		set1.add(30);
		
		var set2 = new HashSet<Integer>();
		set2.add(10);
		set2.add(40);
		set2.add(50);
		set2.add(70);
		set2.add(80);
		
		//set1.addAll(set2);//union
		
//		set1.retainAll(set2); //intersection
		
//		System.out.println(set1);
	
		//set1.remove(20);
		//System.out.println(set1);
		
		var list1= new ArrayList<Integer>(); //set to list
		
		list1.addAll(set1);
		System.out.println(list1);

	}
}
