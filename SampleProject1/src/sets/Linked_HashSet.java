package sets;

import java.util.LinkedHashSet;

/*
 * A linkedHashSet is an ordered version of HashSet
 * LinkedHashSet maintains a doubly-Linked list across all elements
 * no positional access of elements
 */
public class Linked_HashSet {

	public static void main(String[] args) {
			LinkedHashSet<	Character> set1= new LinkedHashSet<Character>();
			set1.add('a');
			set1.add('i');
			set1.add('e');
			set1.add('o');
			set1.add('u');
			
			System.out.println(set1);
	}

}
