package Program_on_Inheritance;

class Vehicle{
	protected String Vehicle_model;
	protected String Reg_Number;
	protected int Vehicle_speed;
	protected int Fuel_Capacity;
	protected int Fuel_consumption;
	int distance;
	int distancecoverd,Fuel_needed;
	public Vehicle(String Vehicle_model,String Reg_Number,int Vehicle_speed,int Fuel_Capacity,int Fuel_consumption) {
		this.Vehicle_model=Vehicle_model;
		this.Reg_Number=Reg_Number;
		this.Vehicle_speed=Vehicle_speed;
		this.Fuel_Capacity=Fuel_Capacity;
		this.Fuel_consumption=Fuel_consumption;
		
	}
	public void distanceCoverd(int hours) {
	     distancecoverd=Vehicle_speed*hours;
	
}
	public void fuelNeeded() {
		Fuel_needed=distancecoverd/Fuel_Capacity;
	
	}
	
	void display() {
		System.out.println("================================================");
		System.out.println("Vehicle Information");
		System.out.println("Vehicle Model "+Vehicle_model);
		System.out.println("Registration Number "+Reg_Number);
		System.out.println("Vehicle speed "+Vehicle_speed);
		System.out.println("Fuel Capcity "+Fuel_Capacity);
		System.out.println("Distance Coverd "+distancecoverd);
		System.out.println("Fuel Needed "+Fuel_needed);
		
	}
}

class Truck extends Vehicle{
	int Cargo_weight_limit;
	public Truck(String Vehicle_model,String Reg_Number,int Vehicle_speed,int Fuel_Capacity,int Fuel_consumption,int Cargo_weight_limit) {
		super(Vehicle_model,Reg_Number,Vehicle_speed,Fuel_Capacity,Fuel_consumption);
			this.Cargo_weight_limit=Cargo_weight_limit;
		}
	   public void  display() {
		 
		super.display();
		System.out.println("Cargo Weight Limit "+Cargo_weight_limit);
		//System.out.println("Truck Information");
		//System.out.println("Vehicle Model "+Vehicle_model);
		//System.out.println("Registration Number "+Reg_Number);
		
		//System.out.println("Vehicle speed "+Vehicle_speed);
//		System.out.println("Fuel Capcity "+Fuel_Capacity);
//		System.out.println("Distance Coverd "+distancecoverd);
//		System.out.println("Fuel Needed "+Fuel_needed);
		
	}
	}
class Bus extends Vehicle{
	int No_pasengers;
	public Bus(String Vehicle_model,String Reg_Number,int Vehicle_speed,int Fuel_Capacity,int Fuel_consumption,int No_pasengers) {
		super(Vehicle_model,Reg_Number,Vehicle_speed,Fuel_Capacity,Fuel_consumption);
			this.No_pasengers=No_pasengers;
		}
	public void  display() {
		System.out.println();
		
		super.display();
		System.out.println("Number of Pasengers "+No_pasengers);
//		System.out.println("Bus Information");
//		System.out.println("Vehicle Model "+Vehicle_model);
//		System.out.println("Registration Number "+Reg_Number);
//		
//		System.out.println("Fuel Capcity "+Fuel_Capacity);
//		System.out.println("Distance Coverd "+distancecoverd);
//		System.out.println("Vehicle speed "+Vehicle_speed);
//		System.out.println("Fuel Needed "+Fuel_needed);
		
	}
}

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck=new Truck("TATA", "MH-22 1199", 40, 20, 20, 1000);
		truck.distanceCoverd(4);
		truck.fuelNeeded();
		truck.display();
		Bus bus=new Bus("Shivshahi", "MH-24 3999", 60, 30, 10, 50);
		bus.distanceCoverd(3);
		bus.fuelNeeded();
		bus.display();
	}

}
