package Interface;
interface AA{
	void show();
}
//class D{
//	void ss() {
//		System.out.println("hi class");
//	}
//}
interface BB extends AA{
//	void ss() {
//		System.out.println("hello");
//	}
	void show1();
}
class C implements BB{
	public void show() {
		System.out.println("this is show of A");
	}
	public void show1() {
		System.out.println("this is show of B");
	}
}
public class InterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cc=new C();
		cc.show();
		cc.show1();

	}

}
