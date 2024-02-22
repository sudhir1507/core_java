package linkedHashMap;

import java.util.*;

public class EledestEntryMethod {
	public static final int size = 5;

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap() {
			protected boolean removeEldestEntry(Map.Entry eldest) {
				return size() > size;
			}
		};
		map.put(10, "PPP");
		map.put(20, "QQQ");
		map.put(30, "lll");
		map.put(40, "kkk");
		map.put(50, "SSS");
		System.out.println("before adding elements" + map);
		map.put(60, "AAA");
		System.out.println("after adding element " + map);
		map.put(70, "BBB");
		System.out.println("after adding element " + map);
	}

}
