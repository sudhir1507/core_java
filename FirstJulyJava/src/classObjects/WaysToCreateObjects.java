package classObjects;
class Test{
	void show() {
		System.out.println("This is show..");
	}
}
public class WaysToCreateObjects {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		Test t=new Test(); //using new keyword
//		t.show();
		
//		Test t=(Test)Class.forName("classObjects.Test").newInstance();  //using forName method of Class class and newInstance() method
//           t.show();
		
//		Test t1=new Test();
//		Test t=(Test)t1.clone();  //using clone method of object class
	}

}
