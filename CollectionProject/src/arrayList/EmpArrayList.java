package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Employeeee{
	int id;
	String name;
	
	
	public Employeeee(int id, String name) {
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
}
public class EmpArrayList {

	public static void main(String[] args) {
		ArrayList<Employeeee> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("case 1:add");
			System.out.println("case 2:view");
			System.out.println("case 3:search");
			System.out.println("case 4:delete");
			System.out.println("case 5:update");
			System.out.println("enter choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter id and name");
				int id=sc.nextInt();
				sc.nextLine();
				String name=sc.nextLine();
				Employeeee e=new Employeeee(id,name);
				list.add(e);
				break;
			case 2:
				for(Employeeee emp:list) {
					System.out.println(emp.getId()+"\t"+emp.getName());
				}
				break;
			case 3:
				boolean flag=false;
				System.out.println("enter id to search employee");
				id=sc.nextInt();
				for(Employeeee em:list) {
					if(em.getId()==id) {
						flag=true;
						break;
					}
				}
				if(flag) {
					System.out.println("Found");
				}else {
					System.out.println("Not found");
				}
				break;
			case 4:
				boolean f=false;
				int idx=-1;
				System.out.println("enter id to delete employee");
				id=sc.nextInt();
				for(Employeeee em:list) {
					if(em.getId()==id) {
						f=true;
						idx=list.indexOf(em);
						break;
					}
				}
				if(f) {
					list.remove(idx);
					System.out.println("removed");
				}else {
					System.out.println("Not found");
				}
				break;
			case 5:
				boolean fg=false;
				int ix=-1;
				System.out.println("enter id to update employee");
				id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter name");
				String n=sc.nextLine();
				for(Employeeee em:list) {
					if(em.getId()==id) {
						ix=list.indexOf(em);
						em.setName(n);
						list.set(ix, em);
						fg=true;
						break;
					}
				}
				if(fg) {
					
					System.out.println("update");
				}else {
					System.out.println("Not update");
				}
				break;
			default :
				System.out.println("Worng choice");
			}
		}while(true);

	}

}
