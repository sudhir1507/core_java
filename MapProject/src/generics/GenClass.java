package generics;
class LIST<T>{
	T obj;
	LIST(T obj){
		this.obj=obj;
	}
	void show() {
		System.out.println(obj);
	}
}
public class GenClass {

	public static void main(String[] args) {
		LIST<Integer> list=new LIST<Integer>(20);
		list.show();
		
		LIST<String> list1=new LIST<String>("Gajanan");
		list1.show();
	}

}
