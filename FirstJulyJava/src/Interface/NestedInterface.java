package Interface;
class Test1{
	interface Yes{
		void show();
	}
}
class Testing implements Test1.Yes{
	public void show() {
		System.out.println("This is OK..");
	}
}
public class NestedInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1.Yes obj;
		Testing tt=new Testing();
		obj=tt;
		obj.show();
	}

}
