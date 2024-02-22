package map;
import java.util.*;
public class MapApp {

	public static void main(String[] args) {
		
       Map<Integer,String> map=new HashMap();
       map.put(1, "ABC");
       map.put(2, "PQR");
       map.put(3, "XYZ");
       map.put(4, "MNO");
       
       Set key=map.keySet();
       Iterator it=key.iterator();
       while(it.hasNext()) {
    	   Object keys=it.next();
    	   Object value=map.get(keys);
    	   System.out.println(keys+" "+value);
    	   
       }
       
       System.out.println("========================");
       for(Map.Entry<Integer,String> e:map.entrySet()) {
    	   System.out.println(e.getKey()+" "+e.getValue());
       }
       
	}

}
