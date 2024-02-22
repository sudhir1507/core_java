package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class PutAllMethod {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap();
		map.put(10, "PPP");
		map.put(20, "QQQ");
		System.out.println(map);
		Map<Integer,String> map1=new LinkedHashMap();
		map1.put(30, "RRR");
		map1.put(40, "SSS");
		map1.put(50, "TTT");
		
		map1.putAll(map);
		System.out.println(map1);

	}

}
