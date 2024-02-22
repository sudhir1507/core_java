package generics;

import java.util.ArrayList;

class StudentTest{
	int id;
	String name;
	String branch;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public StudentTest(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	
}
public class TestAppGenerics {

	public static void main(String[] args) {
		ArrayList<StudentTest> list=new ArrayList<StudentTest>();
		list.add(new StudentTest(1, "Adity", "Mech"));
		list.add(new StudentTest(2,"Gajanan","Extc"));
		list.add(new StudentTest(3, "Akshay", "BCA"));
		
		for(StudentTest st:list) {
			System.out.println(st.getId()+" "+st.getName()+" "+st.getBranch());
		}
	}

}
