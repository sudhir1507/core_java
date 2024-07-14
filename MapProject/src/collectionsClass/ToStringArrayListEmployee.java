package collectionsClass;
import java.util.*;
class Employees{
	int id;
	String name;
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
	
	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "["+id+","+name+"]";
	}
}
public class ToStringArrayListEmployee {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		
		Employees e1=new Employees(1,"Ram");
		Employees e2=new Employees(2,"Shyam");
		Employees e3=new Employees(3, "ganesh");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println(al);

	}

}
