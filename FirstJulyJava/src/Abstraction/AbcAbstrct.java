package Abstraction;
abstract class Mobile{
	abstract void mobfeature();
}
class Vivo extends Mobile{
	void mobfeature() {
		System.out.println("Best Camera qlty");
	}
}
class Nokia extends Mobile{
	void mobfeature() {
		System.out.println("Best battay backup");
	}
}
public class AbcAbstrct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mm=new Vivo();
		mm.mobfeature();
		Mobile mm1=new Nokia();
		mm1.mobfeature();
	}

}
