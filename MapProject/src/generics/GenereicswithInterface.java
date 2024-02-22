package generics;
interface Redius<E>{
	void setRedius(E e);
}
class CircleA implements Redius<Float>{
	public void setRedius(Float e) {
		System.out.println("Area is "+(3.14*e*e));
	}
}
class Cirm implements Redius<Integer>{
	public void setRedius(Integer e) {
		System.out.println("Circumference is "+(3.14*e));
	}
}
public class GenereicswithInterface {

	public static void main(String[] args) {
		CircleA ca=new CircleA();
		ca.setRedius(2.0f);
		Cirm cm=new Cirm();
		cm.setRedius(2);

	}

}
