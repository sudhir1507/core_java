package oops_concepts;

public class Road_Toll {

	String type;
	int tireCount;
	
	public void calculateToll() {
		if(tireCount==2) {
			System.out.println("Your toll count is 0");
		}else if(tireCount==4) {
			System.out.println("your toll count is 10");
		}else if(tireCount>4) {
			System.out.println("Your toll count is 20");
		}else {
			System.out.println("Incorrect toll count");
		}
	}
	public Road_Toll() {
		System.out.println("constructor executed");
	}
	public Road_Toll(String type, int tireCount) {
		this.type=type;
		this.tireCount=tireCount;
	}
}
