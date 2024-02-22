package Interface;
interface Result{
	int getResult();
}
class Square implements Result{
	int no;
	public void setVal(int no) {
		this.no=no;
	}
	public int getResult() {
		return no* no;
	}
}
class Cube implements Result{
	int no;
	public void setVal(int no) {
		this.no=no;
	}
	public int getResult() {
		return no*no*no;
	}
}
public class InterfaceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		s.setVal(4);
		System.out.println(s.getResult());
		Cube c=new Cube();
		c.setVal(3);
		System.out.println(c.getResult());
	}

}
