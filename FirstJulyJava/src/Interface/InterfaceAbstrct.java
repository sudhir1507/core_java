package Interface;
interface Vehicle{
	void engine();
	void speed();
	void drive();
}
abstract class Car implements Vehicle{
	public void engine() {
		System.out.println("1000 CC");
	}
}
abstract class Bike extends Car{
	public void speed() {
		System.out.println("Slower..");
	}
}
class Driver extends Bike{
	public void drive() {
		
	}
}

public class InterfaceAbstrct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver dd=new Driver();
		dd.engine();
		dd.speed();
		dd.drive();
	}

}
