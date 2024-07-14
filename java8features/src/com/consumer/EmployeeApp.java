package com.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
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
//class MyConsumer implements Consumer<Employee>{
//
//	@Override
//	public void accept(Employee t) {
//		System.out.println(t.getId()+"\t"+t.getName());
//		
//	}
//	
//}
public class EmployeeApp {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "abc"));
		list.add(new Employee(2, "pqr"));
		list.add(new Employee(3, "kkk"));
		list.add(new Employee(4, "mmm"));
		
//		MyConsumer obj=new MyConsumer();
//		list.forEach(obj);
		
		Consumer<Employee> s=new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
				System.out.println(t.getId()+"\t"+t.getName());
			}	
		};
		list.forEach(s);
		System.err.println("+++++++++++++++++++++++++++++");
		list.forEach((Employee t)->System.out.println(t.getId()+"\t"+t.getName()));

	}

}
