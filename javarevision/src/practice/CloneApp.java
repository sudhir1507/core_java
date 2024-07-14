package practice;
class Square implements Cloneable{
	int no;
	public void setValue(int  no) {
		this.no=no;
	}
	public int getSquare() {
		return no*no;
	}
	public Square getInstance() throws CloneNotSupportedException{
		return (Square)this.clone();
	}
}
public class CloneApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Square s=new Square();
		s.setValue(10);
		Square s2=s.getInstance();
		s2.setValue(5);

	}

}
