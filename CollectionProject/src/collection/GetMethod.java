package collection;

import java.util.*;

public class GetMethod {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.set(2, 1000);
		
		Object obj=list.get(1);
		if(obj!=null) {
			System.out.println("Data found");
		}else {
			System.out.println("Not found");
		}
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
