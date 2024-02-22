package class_object_assignment;
class Student1{
	int id,totalFees;
	String name;
//	float per;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class DiscountFees{
	Student1 student;
	int disFees=0,actualPaidFees;
	void setStudent(Student1 student) {
		this.student=student;
	}
	void checkDiscountEligibility(int per) {
		if(per>60) {
			disFees=(int)((0.3)*student.getTotalFees());
			actualPaidFees=student.getTotalFees()-disFees;
		}else {
			actualPaidFees=student.getTotalFees();
		}
	}
	void show() {
		System.out.println("ID : "+student.getId());
		System.out.println("Name : "+student.getName());
		System.out.println("Total Fees : "+student.getTotalFees());
		System.out.println("Discount : "+disFees);
		System.out.println("Actual Fees Paid : "+actualPaidFees);
	}
	
	
}
public class StudentApp1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 student1=new Student1();
		DiscountFees ds=new DiscountFees();
		student1.setId(10);
		student1.setTotalFees(10000);
		student1.setName("GAJANAN");
		ds.setStudent(student1);
		ds.checkDiscountEligibility(65);
		ds.show();
	}

}
