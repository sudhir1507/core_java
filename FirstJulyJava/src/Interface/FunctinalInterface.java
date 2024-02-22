package Interface;
@FunctionalInterface
interface Square1{
	void calSquare(int x);
}
public class FunctinalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		Square1 ss=(int x)->System.out.println(x*x);
		ss.calSquare(a);
         
	}

}
