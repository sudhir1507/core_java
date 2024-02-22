package Interface;
interface ABC{
	void show();
}
class MNO implements ABC{
	public void show() {
		System.out.println("Interface demo..");
	}
}
public class InterfaceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC a=new MNO();
		a.show();
	}

}
