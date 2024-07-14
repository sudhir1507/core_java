package com.functional;

import java.util.ArrayList;
import java.util.function.Consumer;

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
	
}
//class MyConsumer implements Consumer<Employee>{
//	public void accept(Employee e)
//	{
//		System.out.println(e.getId()+"\t"+e.getName());
//	}
//}
public class EmployeeConsumerApp {

	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee(1, "abc"));
		emp.add(new Employee(2, "pqr"));
		emp.add(new Employee(3, "mno"));
		
		Consumer<Employee> c=(Employee e)-> {
				System.out.println(e.getId()+"\t"+e.getName());
				
			};
			
	
		emp.forEach(c);

	}

}
