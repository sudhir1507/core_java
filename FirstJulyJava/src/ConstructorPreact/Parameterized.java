package ConstructorPreact;
class Square{
	int no;
	public Square(int no) {
		this.no=no;
	}
	public void showSq() {
		System.out.println(no*no);
	}
}
public class Parameterized {

	public static void main(String[] args) {
		Square sq=new Square(5);
		sq.showSq();

	}

}
