package linkedlist;

import java.util.LinkedList;

public class SortLinkedlist {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(100);
		list.add(200);
		list.add(50);
		list.add(30);
		list.add(24);
		list.add(56);
		System.out.println("Before sorting list");
		for(Object obj:list) {
			System.out.println(obj);
		}
		System.out.println("after sorting list");
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if((int)list.get(i)>(int)list.get(j)) {
					int temp=(int)list.get(i);
					list.set(i, (int)list.get(j));
					list.set(j, temp);
				}
			}
		}
		for(Object obj:list) {
			System.out.println(obj);
		}

	}

}
