package Day6;
abstract class Area{
	public abstract void showArea();
}
class Circle extends Area{
	float r;
	public void setredius(float r) {
		this.r=r;
	}
	@Override
	public void showArea() {
		System.out.println("Area is "+3.14*r*r);
		
	}
	
}
class Rectangle extends Area{
	int l,b;
	public void setlengthbreath(int l,int b) {
		this.l=l;
		this.b=b;
	}
	@Override
	public void showArea() {
		System.out.println("Area of reactngle is "+l*b);
		
	}
	
}
public class AreaApp {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setredius(5.0f);
		c.showArea();
	
		Rectangle r=new Rectangle();
		r.setlengthbreath(4, 6);
		r.showArea();

	}

}
