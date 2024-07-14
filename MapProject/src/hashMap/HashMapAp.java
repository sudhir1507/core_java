package hashMap;
import java.util.*;
public class HashMapAp {

	public static void main(String[] args) {
		HashMap map =new HashMap();
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "aaa");
		
		Set keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			Object value=map.get(key);
			System.out.println(key+"\t"+value);
		}
	}

}
