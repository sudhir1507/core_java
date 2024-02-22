package INHERITANCE;
class Value{
	int a,b;
	public void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
}
class Add extends Value{
	int getAdd() {
		return a+b;
	}
}
class Sub extends Value{
	int getSub() {
		return a-b;
	}
}
class Mul extends Value{
	int getMul(){
		return a*b;
	}
}
class Div extends Value{
	int getDiv() {
		return a/b;
	}
}
public class IheritnaceExp {

	public static void main(String[] args) {
		Add aa=new Add();
		aa.setValue(2,6);
		System.out.println(aa.getAdd());
		Sub ss=new Sub();
		ss.setValue(5, 2);
		System.out.println(ss.getSub());
		Mul mm=new Mul();
		mm.setValue(3, 4);
		System.out.println(mm.getMul());
		Div dd=new Div();
		dd.setValue(8, 2);
		System.out.println(dd.getDiv());
	}

}
