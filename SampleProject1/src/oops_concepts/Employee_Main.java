package oops_concepts;

public class Employee_Main {

	public static void main(String[] args) {
		Employee emp1= new Employee();
		Employee emp2= new Employee();
		
		emp1.empName="Rob";
		emp1.empId=200;
		emp1.empSalary=12345;
		
		emp1.displayEmployeebonus();
		
		emp2.empName="Siva";
		emp2.empId=300;
		emp2.empSalary=98765;
		
		emp2.displayEmployeebonus();
	}

}
