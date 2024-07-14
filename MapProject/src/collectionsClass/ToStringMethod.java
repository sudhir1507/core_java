package collectionsClass;
class Student{
	int id;
	String name;
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
	public String toString() {
		return "["+id+","+name+"]"; //
	}
}
public class ToStringMethod {

	public static void main(String[] args) {
		Student student =new Student();
		student.setId(1);
		student.setName("gajanan");
		
		String str=student.toString(); //convert object into string
		System.out.println(str);
		
		System.out.println(student);//this print the object content in string format
	}

}
