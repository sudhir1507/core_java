package collectionsClass;

import java.util.*;


class EmployeeSort{
	int id;
	String name;
	int salary;
	public EmployeeSort(int id, String name, int salary) {
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
	
}
class EmployeeSortById implements Comparator{
	public int compare(Object o1,Object o2) {
		EmployeeSort e1=(EmployeeSort)o1;
		EmployeeSort e2=(EmployeeSort)o2;
		if(e1.getId()>e2.getId()) {
			return 1;
		}else if(e1.getId()<e2.getId()) {
			return -1;
		}else {
			return 0;
		}
	}
}
class EmployeeSortBySalary implements Comparator{
	public int compare(Object o1,Object o2) {
		EmployeeSort e1=(EmployeeSort)o1;
		EmployeeSort e2=(EmployeeSort)o2;
		if(e1.getSalary()>e2.getSalary()) {
			return 1;
		}else if(e1.getSalary()<e2.getSalary()) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class EmployeeSortByIDAndSal {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		EmployeeSort e1=new EmployeeSort(2, "rushi", 5000);
		EmployeeSort e2=new EmployeeSort(5, "nikhil", 6000);
		EmployeeSort e3=new EmployeeSort(4, "shubham",1000);
		EmployeeSort e4=new EmployeeSort(3, "ram", 9000);
		EmployeeSort e5=new EmployeeSort(1, "shyam",3000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		System.out.println("before sort");
		for(Object obj:al) {
			EmployeeSort e=(EmployeeSort)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
		EmployeeSortById ei=new EmployeeSortById();
		Collections.sort(al,ei);
		System.out.println("after  sort by id");
		for(Object obj:al) {
			EmployeeSort e=(EmployeeSort)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}
		EmployeeSortBySalary es=new EmployeeSortBySalary();
		Collections.sort(al,es);
		System.out.println("after  sort by salary");
		for(Object obj:al) {
			EmployeeSort e=(EmployeeSort)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		}

	}

}
