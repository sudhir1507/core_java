package examples;
import java.util.*;
public class DepartmentApp {
	public static void main(String[] args) {
		LinkedHashMap dept=new LinkedHashMap();
		LinkedHashMap fe=new LinkedHashMap<>();
		fe.put(1, "ABC");
		fe.put(2, "PQR");
		fe.put(3, "XYZ");
		fe.put(4, "DEF");
		
		LinkedHashMap se=new LinkedHashMap<>();
		se.put(1, "abc");
		se.put(2, "pqr");
		se.put(3, "xyz");
		se.put(4, "def");
		
		dept.put("FE",fe);
		dept.put("SE", se);
		
		Set keys=dept.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object val=dept.get(key);
			System.out.println("Class :: "+key);
			LinkedHashMap m=(LinkedHashMap)val;
			Set s=m.keySet();
			Iterator i=s.iterator();
			System.out.println("====================");
			while(i.hasNext()) {
				Object k=i.next();
				Object v=m.get(k);
				System.out.println(k+" "+v);
				
			}
			System.out.println("====================");
		}
	}
}
