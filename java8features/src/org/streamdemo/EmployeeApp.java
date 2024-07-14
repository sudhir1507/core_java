package org.streamdemo;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private int salary;
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
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
public class EmployeeApp {

	public static void main(String[] args) {
		Arrays.asList(new Employee(1, "ganesh", 10000),new Employee(2, "rajesh", 20000),new Employee(3, "Ram", 5000),
				new Employee(4, "Raja", 1000)).stream().filter((Employee e)->e.getSalary()>5000).collect(Collectors.toList()).forEach((Employee ee)->System.out.println(ee.getId()+"\t"+ee.getName()+"\t"+ee.getSalary()));
		

	}

}
