package oops_concepts;

public class Classroom {
	private String subject;
	private int studentCount;
	
	
	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public int getStudentCount() {
		return studentCount;
	}


	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}


	public void displayDetails() {
		System.out.println("This is a "+ subject + " classroom and it has "+studentCount +" students");
	
	}
}
