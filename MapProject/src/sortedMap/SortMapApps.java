package sortedMap;

import java.util.*;

public class SortMapApps {

	public static void main(String[] args) {
		SortedMap<Integer,Integer> map=new TreeMap();
		map.put(1, 1000);
		map.put(2, 2000);
		map.put(3, 30000);
		map.put(4, 4000);
		Collection c=map.values();
		System.out.println(c);

	}

}
