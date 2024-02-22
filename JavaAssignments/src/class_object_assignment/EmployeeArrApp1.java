package class_object_assignment;

import java.util.Scanner;

class Employe1{
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
public class EmployeeArrApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id,sal;
		String name;
		Scanner sc=new Scanner(System.in);
		Employe1 emp[]=new Employe1[5];
		for(int i=0;i<emp.length;i++) {
			emp[i]=new Employe1();
			System.out.println("Enter Employee details :");
			name=sc.next();
			id=sc.nextInt();
			sal=sc.nextInt();
			emp[i].setName(name);
			emp[i].setId(id);
			emp[i].setSal(sal);
			
			
		}
		for (int i = 0; i < emp.length-1; i++) {
			for (int j = i+1; j < emp.length; j++) {
				if(emp[i].getSal()>emp[j].getSal()) {
					Employe1 temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
		System.out.println("After Arragning Datails : ");
		System.out.println("Name    Id     Sal");
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].getName()+"\t"+emp[i].getId()+"\t"+emp[i].getSal());
		}
		sc.close();
	}

}
