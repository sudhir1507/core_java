package javapractical;
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
		this.salary=salary;
	}
	
}
class Dept{
	Employee e[];
	public void acceptEmployee(Employee...e) {
		this.e=e;
	}
	public void show() {
		int sum=0;
		for(int i=0;i<e.length;i++) {
			sum=sum+e[i].getSalary();
			System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSalary());
		}
		System.out.println("Total Salary of all Employee : "+sum);
	}
}
public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("ABC");
		emp.setSalary(10000);
		
		Employee emp1=new Employee();
		emp1.setId(2);
		emp1.setName("MNO");
		emp1.setSalary(20000);
		
		Employee emp2=new Employee();
		emp2.setId(3);
		emp2.setName("PQR");
		emp2.setSalary(30000);
		
		Employee emp3=new Employee();
		emp3.setId(4);
		emp3.setName("STV");
		emp3.setSalary(40000);
		 
		Dept d=new Dept();
		d.acceptEmployee(emp,emp1,emp2,emp3);
		d.show();		
		
	}

}
