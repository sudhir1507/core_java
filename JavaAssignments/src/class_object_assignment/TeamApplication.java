package class_object_assignment;
class Player{
	private int id;
	private String name;
	private int runs;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setRuns(int runs) {
		this.runs=runs;
	}
	public int getRuns() {
		return runs;
	}
}
class Team{
	void addPlayers(Player ...p) {
		for(int i=0;i<p.length;i++) {
			System.out.print(" Id = "+p[i].getId());
			System.out.print(" Name = "+p[i].getName());
			System.out.print(" Runs = "+p[i].getRuns()+"\n");
		}
	}
}
public class TeamApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1=new Player();
		p1.setId(45);
		p1.setName("Rohit");
		p1.setRuns(264);
		
		Player p2=new Player();
		p2.setId(18);
		p2.setName("Virat");
		p2.setRuns(183);
		
		Player p3=new Player();
		p3.setId(77);
		p3.setName("Shubhman");
		p3.setRuns(200);
		
		Team t=new Team();
		t.addPlayers(p1,p2,p3);

	}

}
