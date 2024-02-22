package innerClasses;
class Outer{
	private int a;
	public Outer(){
	a=10;	
	}
		class Inner {
		public void show() {
			System.out.println("Inner class asseccesing private member of outer "+a);
		}
	}
}
public class SimpleInnerClass {

	public static void main(String[] args) {
		Outer obj=new Outer();
		Outer.Inner inobj=obj.new Inner();
		inobj.show();
	}

}
