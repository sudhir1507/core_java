package INHERITANCE;
class ValueS{
	int no;
	ValueS(int n){
//		no=x;
		System.out.println("hi parent");
	}
}
class Square extends ValueS{
	public Square(int x) {
     	super(10);
		System.out.println("hi child");
	}
	public int getSquare() {
		return no*no;
	}
}
public class InhertanceCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square ss=new Square(4);
//		int s=ss.getSquare();
//		System.out.println(s);
	}

}
