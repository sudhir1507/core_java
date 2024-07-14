package map;
import java.util.*;
public class PutMethod {

	public static void main(String[] args) {
		Map<Character,Integer> map=new HashMap();
		map.put('a', 1000);
		map.put('b', 2000);
		map.put('c', 3000);
		map.put('c',4000);
		
		Set keys=map.keySet();
		Iterator i=keys.iterator();
		while(i.hasNext()) {
			
			char key=(char)i.next();
			int value=map.get(key);
			System.out.println(key+"\t"+value);
		}
		for(Map.Entry e:map.entrySet()) {
			char key=(char)e.getKey();
			int value=(int)e.getValue();
			System.out.println(key+" "+value);
		}
		System.out.println("Key present ? "+map.containsKey('g'));
		System.out.println("Value present ? "+map.containsValue(3000));
		map.remove('a');
		System.out.println(map);

	}

}
