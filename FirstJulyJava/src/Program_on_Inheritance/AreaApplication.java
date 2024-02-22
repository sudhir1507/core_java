package Program_on_Inheritance;
abstract class Area{
	abstract void showArea();
}
class Circle extends Area{
	float redius;
	void setRedius(float redius) {
		this.redius=redius;
	}
	public void showArea() {
		System.out.println("Area of Circle : "+(3.14*redius*redius));
	}
}
class Rectangle extends Area{
	int len,wid;
	void setLengthWidth(int len,int wid) {
		this.len=len;
		this.wid=wid;
	}
	public void showArea() {
		System.out.println("Area of Rectangle : "+(len*wid));
	}
}
public class AreaApplication {

	public static void main(String[] args) {
		
		Circle c=new Circle();
		c.setRedius(2.0f);
		c.showArea();
		
		Rectangle r=new Rectangle();
		r.setLengthWidth(12, 10);
		r.showArea();
	}

}
