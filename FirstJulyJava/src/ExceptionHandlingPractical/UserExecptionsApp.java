package ExceptionHandlingPractical;

import java.util.Scanner;

class VoterException extends ArithmeticException{
	String votererror() {
		return "Invalid voter because Age below 18";
	}
}
class VoterMachine{
	public void checkvoter(int age) {
		if(age<18) {
			VoterException ve=new VoterException();
			throw ve;
		}else {
			System.out.println("Valid voter");
		}
	}
}
class EmployeeException extends ArithmeticException
{
	public String getEmployeeError() {
		return "Employee is Not Permanent..";
	}
}
class EmployeeMachine{
	void verifyEmployee(int salary) {
		if(salary<30000) {
			EmployeeException ee=new EmployeeException();
			throw ee;
		}else {
			System.out.println("Employee is Permenent..");
		}
	}
}
public class UserExecptionsApp {

	public static void main(String[] args) {
		VoterMachine vm=new VoterMachine();
		EmployeeMachine em=new EmployeeMachine();
		Scanner sc=new Scanner(System.in);
		do {
			
			System.out.println("\n1.Voter checker ");
			System.out.println("2.Employee checker ");
			System.out.println("Enter choice :");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				try {
					System.out.println("Enter age :");
					int age=sc.nextInt();
					
					vm.checkvoter(age);
				}catch(VoterException ve) {
					System.out.println(ve.votererror());
				}
				break;
			case 2:
				try {
					System.out.println("Enter Employee salary to check Permenent or NOT ");
					int salary=sc.nextInt();
					
					em.verifyEmployee(salary);		
				}catch(EmployeeException ee) {
					System.out.println(ee.getEmployeeError());
					
				}
				break;
			}
			
		}while(true);
	}

}
