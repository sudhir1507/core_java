package Test;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private String contact;
	private String email;
	
	public Student(int id, String name, String contact, String email) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
public class StudentApp {

	public static void main(String[] args) {
		Student s[]=new Student[3];
		LinkedHashMap<Integer,List> map=new LinkedHashMap<>();
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++) {
			System.out.println("enter id name contact email");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			String contact=sc.nextLine();
			String email=sc.nextLine();
			s[i]=new Student(id,name,contact,email);
			List<String> list=new LinkedList<>();
			list.add(s[i].getName());
			list.add(s[i].getContact());
			list.add(s[i].getEmail());
			map.put(s[i].getId(), list);
		}
		for(Map.Entry<Integer, List> m:map.entrySet()) {
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		System.out.println("Enter id to search");
		int id=sc.nextInt();
		boolean flag=false;
		for(Map.Entry<Integer, List> m:map.entrySet()) {
		
			if(id==m.getKey()) {
			   //System.out.println(m.getKey()+"\t"+m.getValue());
			   flag=true;
			   break;
			}
			
		}
		if(flag) {
			System.out.println("found "+map.get(id));
			
		}else {
			System.out.println("Not found");
		}

	}

}
