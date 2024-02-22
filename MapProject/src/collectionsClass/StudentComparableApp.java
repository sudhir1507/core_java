package collectionsClass;

import java.util.Collections;
import java.util.LinkedList;

class Students implements Comparable{
	int id;
	String name;
	int marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Students(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int compareTo(Object o) {
		Students s=(Students)o;
		 if(this.marks>s.marks) {
			 return -1;
		 }else if(this.marks<s.marks) {
			 return 1;
		 }else {
			 return 0;
		 }
	}
}
public class StudentComparableApp {

	public static void main(String[] args) {
		Students s1=new Students(1,"abc",58);
		Students s2=new Students(2,"ccc",84);
		Students s3=new Students(3,"ddd",78);
		Students s4=new Students(4,"bbb",48);
		Students s5=new Students(5,"ttt",88);
		
		LinkedList list=new LinkedList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println("Before sorting");
		for(Object o:list) {
			Students s=(Students)o;
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
		Collections.sort(list);
		System.out.println("After sorting");
		for(Object o:list) {
			Students s=(Students)o;
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMarks());
		}
		
	}

}
