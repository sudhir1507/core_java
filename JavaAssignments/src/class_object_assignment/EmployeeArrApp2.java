package class_object_assignment;

import java.util.Scanner;

class Employee2{
	private int id;
	private String name;
	private int sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}
public class EmployeeArrApp2 {

	public static void main(String[] args) {
	
		int id,sal;
		String name;
		Scanner sc=new Scanner(System.in);
		Employee2 emp[]=new Employee2[5];
		for(int i=0;i<emp.length;i++) {
			emp[i]=new Employee2();
			System.out.println("Enter Employee details :");
			name=sc.next();
			id=sc.nextInt();
			sal=sc.nextInt();
			emp[i].setName(name);
			emp[i].setId(id);
			emp[i].setSal(sal);
				
		}
		System.out.println("Enter id for delete :");
		id=sc.nextInt();
		for (int i = 0; i < emp.length; i++) {
			if(id==emp[i].getId()) {
				for (int j = i; j < emp.length-1; j++) {
					emp[j]=emp[j+1];
				}
			}
		}
		System.out.println("Name    Id     Sal");
		for (int i = 0; i < emp.length-1; i++) {
			System.out.println(emp[i].getName()+"\t"+emp[i].getId()+"\t"+emp[i].getSal());
		}
		sc.close();
	}

}
