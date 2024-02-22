package javapractical;

import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private float per;
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
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
//	}
	
}
class StudentRecord{
	Student s[];
	public void acceptStudent(Student...s) {
		this.s=s;
	}
	public Student getStudent(int ID) {
		int index=0;
		boolean b=false;
		for(int i=0;i<s.length;i++) {
			if(ID==s[i].getId()) {
				
				b=true;
				index=i;
				break;
			}
		}
		if(b) {
			return s[index];
		}else {
			return null;
		}
		
	}
}
public class StudentApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		s1.setId(10);
		s1.setName("abc");
		s1.setPer(90.20f);
		
		Student s2=new Student();
		s2.setId(20);
		s2.setName("pqr");
		s2.setPer(80.20f);
		
		Student s3=new Student();
		s3.setId(30);
		s3.setName("xyz");
		s3.setPer(95.20f);
		
		Student s4=new Student();
		s4.setId(40);
		s4.setName("ijk");
		s4.setPer(70.20f);
		
		StudentRecord sr=new StudentRecord();
		sr.acceptStudent(s1,s2,s3,s4);
		System.out.println("Enter Student ID to search :");
		int ID=sc.nextInt();
		Student s=sr.getStudent(ID);
		System.out.println("Found Data:"+s.getId()+"\t"+s.getName()+"\t"+s.getPer());
		sc.close();
	}

}
