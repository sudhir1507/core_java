package Exception_Handling;
class PropogationApp{
	void m() {
		int a=10/0;
	}
	void n() {
		m();
	}
	void p() {
		try {
		   n();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class PropogatedExceptionApp {
	public static void main(String []args) {
		PropogationApp pp=new PropogationApp();
		pp.p();
		System.out.println("Rest of the code");
	}
}
