package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

class Players implements Comparable{
	int id;
	String name;
	int run;
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
	public Players(int id,int run,String name) {
		this.id=id;
		this.run=run;
		this.name=name;
	}
	public int compareTo(Object o) {
		Players p=(Players)o;
		if(this.run>p.run) {
			return 1;
		}else if(this.run<p.run) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class ComparableInterfaceApp {

	public static void main(String[] args) {
		
		Players p1 = new Players(1,10000,"RAm");
		Players p2 = new Players(2,5000,"Shyam");
		Players p3 = new Players(5,20000,"Ganesh");
		Players p4 = new Players(3,6000,"Rajesh");
		Players p5 = new Players(4,600,"Mangesh");
		 
		 ArrayList al = new ArrayList();
		 al.add(p1);
		 al.add(p2);
		 al.add(p3);
		 al.add(p4);
		 al.add(p5);

		 System.out.println("Before sorting ");
		 for(Object o:al) {
			 Players p=(Players)o;
			 System.out.println(p.getId()+" "+p.getName()+" "+p.getRun());
		 }
		 Collections.sort(al);
		 System.out.println("After sorting ");
		 for(Object o:al) {
			 Players p=(Players)o;
			 System.out.println(p.getId()+" "+p.getName()+" "+p.getRun());
		 }

	}

}
