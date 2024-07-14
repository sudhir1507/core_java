package linkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class StudentMap {

	public static void main(String[] args) {
		LinkedHashMap map=new LinkedHashMap<>();
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("case 1:add");
			System.out.println("case 2:view");
			System.out.println("case 3:delete");
			System.out.println("case 4:search");
			System.out.println("case 5:update");
			System.out.println("enter choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("ENter id and name");
				int id=sc.nextInt();
				sc.nextLine();
				String name=sc.nextLine();
				Student s=new Student(id, name);
				map.put(s.getId(), s.getName());
				break;
			case 2:
				Set keys=map.keySet();
				Iterator i=keys.iterator();
				while(i.hasNext()) {
					Object key=i.next();
					Object val=map.get(key);
					System.out.println(key+"\t"+val);
				}
				break;
			case 3:
				System.out.println("Enter id to delete");
				id=sc.nextInt();
				keys=map.keySet();
				boolean flag=false;
				Iterator it=keys.iterator();
				while(it.hasNext()) {
					Object key=it.next();
					int ss=(int)key;
					if(ss==id) {
						map.remove(key);
						flag=true;
						break;
					}
				}
				if(flag) {
					System.out.println("remvoed");
				}else {
					System.out.println("Not");
				}
				break;
			case 4:
				System.out.println("Enter id to search");
				id=sc.nextInt();
				keys=map.keySet();
				flag=false;
				Iterator itt=keys.iterator();
				while(itt.hasNext()) {
					Object key=itt.next();
					int ss=(int)key;
					if(ss==id) {
						flag=true;
						break;
					}
				}
				if(flag) {
					System.out.println("found");
				}else {
					System.out.println("Not");
				}
				break;
			case 5:
//				System.out.println("Enter id to update");
//				id=sc.nextInt();
//				sc.nextLine();
//				System.out.println("Entter value to update(name)");
//				name=sc.nextLine();
//				keys=map.keySet();
//			     flag=false;
//				Iterator ii=keys.iterator();
//				while(ii.hasNext()) {
//					Object key=ii.next();
//					int ss=(int)key;
//					if(ss==id) {
//						Object o=key;
//						flag=true;
//						break;
//					}
//				}
//				if(flag) {
//					map.put(key,name);
//					System.out.println("updated");
//				}else {
//					System.out.println("Not");
//				}
				break;
			case 6:
				break;
			default:
			   System.out.println("Worng choice");
			}
		}while(true);

	}

}
