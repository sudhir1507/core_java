package treeMap;

import java.util.TreeMap;

public class CloneMethod {

	public static void main(String[] args) {
		TreeMap map=new TreeMap<>();
		map.put("aaa",1);
		map.put("bbb",2);
		map.put("ccc",3);
		System.out.println(map.containsValue(2));
		TreeMap mp=(TreeMap)map.clone();
		System.out.println(mp);

	}

}
