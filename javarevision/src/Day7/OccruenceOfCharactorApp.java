package Day7;

import java.util.HashMap;
import java.util.Map;

public class OccruenceOfCharactorApp {

	public static void main(String[] args) {
		String str="this is java and its a simple language";
		HashMap< Character, Integer> occurence=new HashMap<>();
		char ch[]=str.toCharArray();
		for(char c:ch) {
			if(occurence.containsKey(c)) {
				occurence.put(c, occurence.get(c)+1);
			}else {
				occurence.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> map:occurence.entrySet()) {
			System.out.println(map.getKey()+"\t"+map.getValue());
		}

	}

}
