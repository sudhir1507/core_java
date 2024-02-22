package JavaPack;
class Emp{
	int eid;
	int salary;
	static String ceo;
	public void show() {
		System.out.println(eid + ": "+salary+": "+ceo);
	}
	
	
}
public class DemoStatic {

	public static void main(String[] args) {
		System.out.println();
		Emp navin = new Emp();
		navin.eid=1;
		navin.salary=5000;
		Emp.ceo="mahesh";
		Emp sudhir = new Emp();
		sudhir.eid=2;
		sudhir.salary=6000;
		Emp.ceo="Mahesh";
		
		navin.show();
		sudhir.show();
		
		
	}

}
