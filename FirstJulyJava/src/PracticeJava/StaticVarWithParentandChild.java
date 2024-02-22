package PracticeJava;
class Xyz{
	final int m=34;
	static int x=10;
}
class Y extends Xyz{
	public void show() {
		System.out.println("m = "+m);
	}
}
public class StaticVarWithParentandChild {

	public static void main(String[] args) {
		Y obj=new Y();
		obj.show();

	}

}
