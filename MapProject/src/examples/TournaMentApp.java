package examples;
import java.util.*;
public class TournaMentApp {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Rohit");
		a1.add("Virat");
		a1.add("Jadeja");
		a1.add("KL Rahul");
		a1.add("Bumrah");
		
		ArrayList a2=new ArrayList<>();
		a2.add("Cummince");
		a2.add("Smith");
		a2.add("Maxwell");
		a2.add("Warner");
		a2.add("Starc");
		
		LinkedHashMap map=new LinkedHashMap();
		map.put("India", a1);
		map.put("Australia", a2);
		
		Set set=map.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			System.out.println("=========================");
			System.out.println("Team "+key);
			ArrayList a=(ArrayList)map.get(key);
			System.out.println("*************************");
			for(Object obj:a) {
				System.out.println(obj);
			}
			System.out.println("**************************");
		}

	}

}
