package collection;

import java.io.*;


class Employee implements Serializable{
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
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
}
public class SerilizationApp {

	public static void main(String[] args) throws Exception {
		FileOutputStream fs=new FileOutputStream("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer1.txt");
		ObjectOutputStream ob=new ObjectOutputStream(fs);
		Employee e=new Employee(1, "abx", 10000);
		ob.writeObject(e);
		ob.close();
		fs.close();
		System.out.println("Employee stored sussess...");
		
		FileInputStream fi=new FileInputStream("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer.txt");
		try (ObjectInputStream fn = new ObjectInputStream(fi)) {
			Object obj=fn.readObject();
			if(obj!=null) {
				Employee emp=(Employee)obj;
				System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary());
			}else {
				System.out.println("Not found");
			}
		}
	}

}
