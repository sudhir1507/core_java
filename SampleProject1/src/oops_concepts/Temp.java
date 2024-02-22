package oops_concepts;

public class Temp {

	public static void main(String[] args) {
		Cars c1= new Cars();
		c1.color="Red";
		c1.make="BMW";
		
		c1.displayDetails();
		
		Cars c2= new Cars();
		c2.color="black";
		c2.make="Toyata";
		c2.type="XYZ";
		c2.displayDetails();
	}

}
