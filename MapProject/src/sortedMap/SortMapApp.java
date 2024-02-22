package sortedMap;

import java.util.*;

public class SortMapApp {

	public static void main(String[] args) {
		SortedMap<Integer,Integer> map=new TreeMap();
		map.put(1, 1000);
		map.put(2, 2000);
		map.put(3, 30000);
		map.put(4, 4000);
		
		for(Map.Entry e:map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}

		//way to iterate over the map
		for(int k:map.keySet()) {
			System.out.println(k+" "+map.get(k));
		}
	}

}
