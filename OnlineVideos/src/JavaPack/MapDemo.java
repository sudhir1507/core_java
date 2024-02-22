package JavaPack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map =new HashMap<>();
		map.put(1, "sudhir");
		map.put(2,"john");
		map.put(3, "quora");
		
		Set<Integer> keys=map.keySet();
		for(Integer key:keys) {
			System.out.println(key+" "+map.get(key));
		}
	}

}
