package maps;

import java.util.TreeMap;

/*
 * TreeMap is implemented based on red-black tree structure
 * it is sorted by keys
 */
public class Tree_Map {

	public static void main(String[] args) {
		var map = new TreeMap<Character,Integer>();
		 map.put('d', 1000);
		 map.put('a', 2000);
		 map.put('c', 3000);
		 map.put('b', 4000);
		 
		 //System.out.println(map.containsValue(3000));
		// map.replace('a', 6000);
		 
		 System.out.println(map.firstEntry());
		 System.out.println(map.lastEntry());
		 System.out.println(map.firstKey());
		 System.out.println(map.lastKey());
		 
		 System.out.println(map.pollFirstEntry());
		 System.out.println(map.pollLastEntry());
		 System.out.println(map);

	}

}
