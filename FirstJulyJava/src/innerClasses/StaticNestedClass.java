package innerClasses;
class StaticNested{
	private static void show(){
		System.out.println("Outer class Static method..");
	}
	static class StatNested{
		public static void display() {
			show();
			System.out.println("Inner static display..");
		}
	}
}
public class StaticNestedClass {

	public static void main(String[] args) {
		
//		StaticNested.StatNested obj=new StaticNested.StatNested();
//		obj.display();  with object 
		StaticNested.StatNested.display(); //using class name
	}

}
