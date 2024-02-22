package map;

import java.util.*;

public class GetMethodMap {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap();
		map.put(10, "PPP");
		map.put(20, "QQQ");
		map.put(30, "RRR");
		map.put(40, "SSS");
		map.put(50, "TTT");
		
		System.out.println("get method to fetch "+map.get(30));
		
		for(Map.Entry e:map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
System.out.println("==============================");
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+" "+value);
					
		}
		System.out.println("=======================");
		Set s=map.keySet();
		System.out.println(s);
	}

}
