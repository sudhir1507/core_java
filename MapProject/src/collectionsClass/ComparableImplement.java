package collectionsClass;
import java.lang.*;
import java.util.*;
class Pl{
	int id;
	String name;
	int run;
	public Pl(int id, String name, int run) {
		super();
		this.id = id;
		this.name = name;
		this.run = run;
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
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	
}
class SortbyIds implements Comparator{
	public int compare(Object o,Object o1) {
		Pl p1=(Pl)o;
		Pl p2=(Pl)o1;
		if(p1.getId()>p2.getId())
		  return 1;
		else if(p1.getId()<p2.getId())
			return -1;
		else
			return 0;
	}
}
public class ComparableImplement {

	public static void main(String[] args) {
		Pl p1=new Pl(1,"aa",230);
		Pl p2=new Pl(5,"aa",330);
		Pl p3=new Pl(3,"a",23);
		Pl p4=new Pl(2,"aag",340);
		Pl p5=new Pl(4,"aae",20);
		List list=new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		SortbyIds s=new SortbyIds();
		Collections.sort(list,s);
		for(Object o:list) {
			Pl p=(Pl)o;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
		

	}

}
