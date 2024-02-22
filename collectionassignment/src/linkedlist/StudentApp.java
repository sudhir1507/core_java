package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Student{
	int id;
	String name;
	float per;
	public Student(){
		
	}
	public Student(int id,String name,float per) {
		this.id=id;
		this.name=name;
		this.per=per;
	}
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
}
public class StudentApp {

	public static void main(String[] args) {
		LinkedList<Student> list=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int size=sc.nextInt();
		Student s[]=new Student[size];
		System.out.println("Enter student details:");
		for(int i=0;i<s.length;i++) {
			System.out.println("Enter the id ,percentage and name");
			int id=sc.nextInt();
			float per=sc.nextFloat();
			sc.nextLine();
			String name=sc.nextLine();
			s[i]=new Student(id,name,per);
			list.add(s[i]);
		}
		System.out.println("All Student details :");
		Iterator it=list.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			Student s1=(Student)obj;
			System.out.println("=================================");
			System.out.println("Id : "+s1.getId());
			System.out.println("Name : "+s1.getName());
			System.out.println("Per : "+s1.getPer());
		}
		int max=0;
		for(Object obj:list) {
			Student s1=(Student)obj;
			if(s1.getPer()>max) {
				max=(int)s1.getPer();
			}
		}
		System.out.println("\nTopper of the class");
		System.out.println("============================");
		for(Object obj:list) {
			Student s2=(Student)obj;
			if((int)s2.getPer()==max) {
				System.out.println("Id : "+s2.getId());
				System.out.println("Name : "+s2.getName());
				System.out.println("Per : "+s2.getPer());
			}
		}
		

	}
}


