package hashMap;
import java.util.*;
public class HashMapApp {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		
		map.put(10, "abc");
		map.put(20, "bbb");
		map.put(30, "abc");
		map.put(null, "mmm");
		map.put(null, "nnn");
		
		System.out.println(map);
		System.out.println("size "+map.size());
		System.out.println(map.remove(10));
		System.out.println(map);
	

	}

}
