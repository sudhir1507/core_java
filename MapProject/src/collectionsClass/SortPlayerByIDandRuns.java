package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

class PlayerSort implements Comparable{
	int id;
	String name;
	int salary;
	public PlayerSort(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int compareTo(Object o) {
		PlayerSort p=(PlayerSort)o;
		if(this.id>p.getId()) {
			return 1;
		}else if(this.id<p.getId()){
			return -1;
		}else {
			return 0;
		}
	}
}
public class SortPlayerByIDandRuns {

	public static void main(String[] args) {
		PlayerSort p1=new PlayerSort(3, "aaa", 123);
		PlayerSort p2=new PlayerSort(5, "bbb", 99);
		PlayerSort p3=new PlayerSort(2, "ccc", 23);
		PlayerSort p4=new PlayerSort(1, "ddd", 130);
		PlayerSort p5=new PlayerSort(4, "eee", 12);
		ArrayList al=new ArrayList<>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		for(Object o:al) {
			PlayerSort p=(PlayerSort)o;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSalary());
		}
		Collections.sort(al);
		System.out.println("after sort");
		for(Object o:al) {
			PlayerSort p=(PlayerSort)o;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getSalary());
		}
	}

}
