package treeMap;
import java.util.*;
public class TreeMapApp {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap();
		map.put(1, "abc");
		map.put(2, "pqr");
		map.put(3, "sss");
		map.put(4, "qqq");
		map.put(5, "rrr");
		
		System.out.println(map);
		
//		for(Map.Entry e:map.entrySet()) {
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
	     Set keys=map.keySet();
	     Iterator it=keys.iterator();
	     while(it.hasNext()) {
	    	 int key=(int)it.next();
	    	 String value=(String)map.get(key);
	    	 System.out.println(key+" "+value);
	     }
	}

}
