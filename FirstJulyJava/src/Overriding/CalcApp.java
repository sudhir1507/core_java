package Overriding;
class Valuec{
	int a,b;
	void setvalue(int x,int y) {
		a=x;
		b=y;
	}
	int getResult() {
		return 0;
	}
}
class Add extends Valuec{
	int getResult() {
		return a+b;
	}
}
class Mul extends Valuec{
	int getResult() {
		return a*b;
	}
}
public class CalcApp {

	public static void main(String[] args) {
		Add aa=new Add();
		aa.setvalue(10, 5);
		System.out.println(aa.getResult());
		Mul mm=new Mul();
		mm.setvalue(3, 4);
		System.out.println(mm.getResult());

	}

}
