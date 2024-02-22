package PracticeJava;
class EmployeeData{
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
	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", salary=" + salary + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
public class EmpToString {

	public static void main(String[] args) {
		EmployeeData emp=new EmployeeData();
		emp.setId(10);
		emp.setName("abc");
		emp.setSalary(12000);
		System.err.println(emp.toString());

	}

}
