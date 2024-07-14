package collectionsClass;
class SquareApp implements Cloneable{
	int no;
	public SquareApp() {
		System.out.println("im am cons");
	}
	void setval(int no){
		this.no=no;
	}
	int getsquare() {
		return no*no;
	}
	public SquareApp getInstance() throws CloneNotSupportedException {
		return (SquareApp)this.clone();
	}
}
public class CloneApp {

	public static void main(String[] args) throws Exception {
		SquareApp s1=new SquareApp();
		s1.setval(10);
		
		SquareApp s2=s1.getInstance();
		s2.setval(5);
		
		System.out.println(s1.getsquare());
		//System.out.println(s2.getsquare());
	}

}
