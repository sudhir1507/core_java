package Interface;
interface Printable{
	interface writeable{
		void write();
	}
}
class TestInterface implements Printable.writeable{
	public void write() {
		System.out.println("This is write() method..");
	}
}
public class NestedInterfaceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable.writeable obj=new TestInterface();
		obj.write();

	}

}
