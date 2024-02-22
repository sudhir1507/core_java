package treeMap;

import java.util.*;

public class HeadMapMethod {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "abc");
		map.put(2, "pqr");
		map.put(3, "sss");
		map.put(4, "qqq");
		map.put(5, "rrr");
		System.out.println("first map "+map);
		SortedMap<Integer,String> mt=new TreeMap<Integer,String>();
		mt=(TreeMap)map.headMap(4);
		System.out.println("Headmap "+mt);

	}

}
