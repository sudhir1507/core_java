package objectClass;
import java.util.*;
class Employee{
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
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object o) {
		Employee e=(Employee)o;
		if((this.id==e.id)&&(this.name.equals(e.name))) {
			return true;
		}else {
			return false;
		}
	}
	public int hashCode() {
		return id*100;
	}
}
public class SetWithDuplicatedObj {

	public static void main(String[] args) {
		Set<Employee> set=new LinkedHashSet();
		
		set.add(new Employee(1, "abc"));
		set.add(new Employee(2, "mno"));
		set.add(new Employee(1, "abc"));
		set.add(new Employee(2, "mno"));
		
		for(Employee e:set) {
			System.out.println(e.getId()+" "+e.getName()+" "+System.identityHashCode(e));
		}

	}

}
