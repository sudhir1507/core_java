package linkedHashMap;
import java.util.*;
public class LinkedHashMapApp {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap();
		
		map.put(30, "PPa");
		map.put(40, "QQf");
		map.put(10, "PPP");
		map.put(20, "QQQ");
		
		for(Map.Entry e:map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+" "+value);
		}

	}

}
