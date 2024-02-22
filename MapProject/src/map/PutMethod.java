package map;
import java.util.*;
public class PutMethod {

	public static void main(String[] args) {
		Map<Character,Integer> map=new HashMap();
		map.put('a', 1000);
		map.put('b', 2000);
		map.put('c', 3000);
		map.put('d',4000);
		
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
