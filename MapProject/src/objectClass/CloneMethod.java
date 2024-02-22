package objectClass;
class Square implements Cloneable{
	int no;
	public Square() {
		System.out.println("Constructot executed");
	}
	public void setValue(int no) {
		this.no=no;
	}
	public int getSquare() {
		return no*no;
	}
	public Square getInstance()throws CloneNotSupportedException{
		return (Square) this.clone();
	}
	
}
public class CloneMethod {

	public static void main(String[] args) throws Exception {
		Square sq=new Square();
		sq.setValue(10);
		Square s1=sq.getInstance();
		//Square s1=new Square();
		s1.setValue(5);
		int square=sq.getSquare();
		System.out.println("Square is "+square);

	}

}
