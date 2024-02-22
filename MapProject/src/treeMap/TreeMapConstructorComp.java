package treeMap;
import java.util.*;
class Student{
	int id;
	String name;
	String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(){
		
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
class SortByID implements Comparator<Student>{
	public int compare(Student a,Student b) {
		return a.id-b.id;
	}
}
public class TreeMapConstructorComp {

	public static void main(String[] args) {
		TreeMap<Student,Integer> map=new TreeMap(new SortByID());
		map.put(new Student(2,"abc","pune"), 100);
		map.put(new Student(1,"pqr","nanded"), 200);
		map.put(new Student(4,"mno","Nashik"), 300);
		map.put(new Student(3,"RRR","jalana"), 400);
		
		//System.out.println(map);
//		Set keys=map.keySet();
//		Iterator it=keys.iterator();
//		while(it.hasNext()) {
//			Student s=(Student)it.next();
//			int value=(int)map.get(s);
//			System.out.println(s+" "+value);
//		}
//		Set set=map.entrySet();
//		Iterator it=set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}

}
