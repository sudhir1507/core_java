package Day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class RepeatativeNumberVector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(40);
		v.add(30);
		v.add(20);
		v.add(50);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(50);
		HashMap<Integer, Integer> occurence=new HashMap<>();
		for(int number:v) {
			if(occurence.containsKey(number)) {
				occurence.put(number, occurence.get(number)+1);
			}else {
				occurence.put(number, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> map:occurence.entrySet()) {
			System.out.println(map.getKey()+"\t"+map.getValue());
		}

	}

}
