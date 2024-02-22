package filehandling;

import java.io.*;

class Employee1 implements Serializable{  //while running make Employee1 to Employee
	private int id;
	private String name;
	private int sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}
public class DiserializationApp {

	public static void main(String[] args) throws Exception{
		FileInputStream fin=new FileInputStream("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\demo\\Employeedata.txt");
		ObjectInputStream fout=new ObjectInputStream(fin);
		Object obj=fout.readObject();
		if(obj!=null) {
			Employee emp=(Employee)obj;
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
		}else {
			System.out.println("Object not found..");
		}
		fout.close();
		fin.close();
	}

}
