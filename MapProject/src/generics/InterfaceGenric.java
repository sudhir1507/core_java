package generics;
interface Areas<E> {
	void getarea(E e);
}
class Circle implements Areas<Float>{
	public void getarea(Float e) {
		System.out.println(3.14*e*e);
	}
}
class Rectangle implements Areas<Integer>{
	public void getarea(Integer e) {
		System.out.println(e*e);
	}
	
}
public class InterfaceGenric {

	public static void main(String[] args) {
		Circle cc=new Circle();
		System.identityHashCode(cc);
		cc.getarea(2.0f);
		Rectangle rr=new Rectangle();
		rr.getarea(4);

	}

}
