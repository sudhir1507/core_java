package javaStrings;
import java.util.*;
import java.util.Map.Entry;
public class MaxRepeatativeChar {

	public static void main(String[] args) {
		String str="abcsabeeeerf";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i),1);
			}
		}
		int maxcount=0;
		int secmax=0;
		char secmaxc=str.charAt(0);
		char maxchar=str.charAt(0);
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			if(m.getValue()>maxcount) {
				maxchar=m.getKey();
				secmax=maxcount;
				
				maxcount=m.getValue();
			}
		}
		System.out.println("Most repeative char "+maxchar);
		for(Entry<Character, Integer> mm:map.entrySet()) {
			if(mm.getValue()==secmax) {
				System.out.println("Second Most repeative char "+mm.getKey());
			}
		}

	}

}
