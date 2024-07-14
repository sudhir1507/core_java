package generics;
class Test1<T,U>{
	T t;
	U u;
	Test1(T t,U u){
		this.t=t;
		this.u=u;
	}
	void print() {
		System.out.println(t);
		System.out.println(u);
	}
}
public class GenWithTwoParameter {

	public static void main(String[] args) {
		Test1<Integer,String> tt=new Test1(10,"Gajanan");
		tt.print();

	}

}
