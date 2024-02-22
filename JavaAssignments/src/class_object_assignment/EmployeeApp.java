package class_object_assignment;

import java.util.Scanner;

class Employee{
	int id,basicSal;
	double totalSal,incrementalSal;
	String name;
	void setPersnonalInfo(String name,int id,int basicSal){
		this.name=name;
		this.id=id;
		this.basicSal=basicSal;
	}
	void setProgress(int progress) {
		if(progress>60) {
			totalSal=basicSal+basicSal*0.3;
			incrementalSal=totalSal-basicSal;
		}else {
			totalSal=basicSal;
		}
		
	}
	void show() {
		
		System.out.println("Name "+name+"\nId "+id+"\nBasic Salary "+basicSal);
		System.out.println("Incremental Salary "+incrementalSal+"\nTotal Salary "+totalSal);
	}
}
public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id,basicSal,progress;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name,id and Basic salary");
		try {
			name=sc.next();
			id=sc.nextInt();
			basicSal=sc.nextInt();
			System.out.println("Enter Employee Progress :");
			progress=sc.nextInt();
			Employee ee=new Employee();
			ee.setPersnonalInfo(name, id, basicSal);
			ee.setProgress(progress);
			ee.show();
			
		} catch (Exception e) {
			System.out.println("Please Enter Correct Input..");
		} finally {
			System.out.println("Employee Details..");
			sc.close();
		}
	}

}
