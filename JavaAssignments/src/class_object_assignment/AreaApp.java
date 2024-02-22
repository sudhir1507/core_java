package class_object_assignment;

import java.util.Scanner;

class Circle{
	float redius;
	public void setRedius(float redius) {
		this.redius=redius;
	}
	public void showArea() {
		System.out.println("Area of Circle = "+(3.14*redius*redius) );
	}
}
public class AreaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the redius of circle");
		r=sc.nextFloat();
		Circle c=new Circle();
		c.setRedius(r);
		c.showArea();
	}

}
