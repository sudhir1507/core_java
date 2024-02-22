package examples;
import java.util.*;
class Player{
	int id;
	String name;
	int run;
	String address;
	public Player() {
		
	}
	public Player(int id, String name, int run, String address) {
		super();
		this.id = id;
		this.name = name;
		this.run = run;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
public class MapWithPojoApp {

	public static void main(String[] args) {
		LinkedHashMap map=new LinkedHashMap();
		Player p1=new Player(1,"abc",100,"pune");
		Player p2=new Player(2,"pqr",50,"nanded");
		Player p3=new Player(3,"mno",67,"nashik");
		Player p4=new Player(4,"kkk",30,"Dhule");
		Player p5=new Player(5,"xyz",140,"Purna");
		
		map.put(p1.getId(), p1);
		map.put(p2.getId(), p2);
		map.put(p3.getId(),p3);
		map.put(p4.getId(),p4);
		map.put(p5.getId(), p5);
		
	    Set keys=map.keySet();
	    Iterator it=keys.iterator();
	    while(it.hasNext()) {
	    	Object key=it.next();
	    	Player p=(Player)map.get(key);
	    	System.out.println(p.getId()+" "+p.getName()+" "+p.getRun()+" "+p.getAddress());
	    }
	}

}
