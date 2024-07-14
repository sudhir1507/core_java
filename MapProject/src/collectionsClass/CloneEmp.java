package collectionsClass;
class Empl implements Cloneable{
	int id;
	String name;
	public Empl(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public Empl getinstance()throws CloneNotSupportedException {
		return (Empl)this.clone();
	}
}
public class CloneEmp {

	public static void main(String[] args) {
		Empl e=new Empl(1, "abc");
		System.out.println(e.getId()+"\t"+e.getName());
		try {
			Empl e1=e.getinstance();
			System.out.println(e1.getId()+"\t"+e1.getName());
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
