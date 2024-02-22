package generics;
import java.util.*;
import java.util.Map.Entry;
public class GenericsWithMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
				map.put(1, "abc");
				map.put(2, "mno");
				map.put(3, "xyz");
				
				Set<Map.Entry<Integer, String>> set=map.entrySet();
				Iterator<Map.Entry<Integer, String>> it=set.iterator();
				while(it.hasNext()) {
					Map.Entry e=it.next();
					System.out.println(e.getKey()+" "+e.getValue());
				}
	}

}
