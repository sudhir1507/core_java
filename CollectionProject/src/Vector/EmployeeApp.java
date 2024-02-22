package Vector;
import java.util.*;
class Employee{
	int id;
	String name;
	int salary;
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
}
public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(10);
		e1.setName("Gajanan");
		e1.setSalary(100000);
		Employee e2=new Employee();
		e2.setId(11);
		e2.setName("Sachin");
		e2.setSalary(200000);
		Employee e3=new Employee();
		e3.setId(12);
		e3.setName("Vishal");
		e3.setSalary(300000);
		Employee e4=new Employee();
		e4.setId(13);
		e4.setName("Ram");
		e4.setSalary(400000);
		
		Vector v=new Vector();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		
		Enumeration em=v.elements();
		while(em.hasMoreElements()) {
			Object obj=em.nextElement();
			Employee e=(Employee)obj;
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		System.out.println(v);
	}

}
