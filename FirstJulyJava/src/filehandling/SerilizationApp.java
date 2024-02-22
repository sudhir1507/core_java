package filehandling;
import java.io.*;
class Employee implements Serializable{
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
public class SerilizationApp {

	public static void main(String[] args) throws Exception {
		FileOutputStream file=new FileOutputStream("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\demo\\Employeedata.txt");
		ObjectOutputStream fout=new ObjectOutputStream(file);
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Gajanan");
		emp.setSal(50000);
		fout.writeObject(emp);
		fout.close();
		file.close();
		System.out.println("Saved....");
	}

}
