package javaStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		
		HashMap<Character, Integer> map=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {  //abcadecd
				map.put(str.charAt(i), map.get(str.charAt(i))+1); //
			}else {
				map.put(str.charAt(i), 1);  //a 1
			}
		}
		for(Map.Entry<Character, Integer> m:map.entrySet()) {
			if(m.getValue()>1) {
				System.out.println(m.getKey()+"--->"+m.getValue());
			}
		}

	}

}
