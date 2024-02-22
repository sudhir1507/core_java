package sortedMap;
import java.util.*;
public class SortedApp {

	public static void main(String[] args) {
		SortedMap map=new TreeMap();
		map.put(1, 1000);
		map.put(2, 2000);
		map.put(3, 30000);
		map.put(4, 4000);
		
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		
		while(it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+" "+value);
		}
		System.out.println("First element "+map.firstKey());
		System.out.println("LAst key or highest key "+map.lastKey());
		SortedMap<String,Integer> sm=new TreeMap<String,Integer>();
		sm.put("Abc",1000);
		sm.put("mno", 2000);
		sm.put("pqr", 3000);
		sm.put("ttt", 5000);
		
		for(Map.Entry e:sm.entrySet()) {
		     System.out.println(e.getKey()+" "+e.getValue());
		}
		
		for(String k:sm.keySet()) {
			String key=(String)k;
			int value=(Integer)sm.get(key);
			System.out.println(key+" "+value);
		}
	}

}
