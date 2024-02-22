package innerClasses;
class PrivateInnerdemo{
	private class InnerDemo{
		public void display() {
			System.out.println("Inner display");
		}
	}
	public void demo() {
		System.out.println("this is outer show");
		InnerDemo inobj=new InnerDemo();
		inobj.display();
	}
	  
	}
	

public class PrivateInnerclass {

	public static void main(String[] args) {
		PrivateInnerdemo pp=new PrivateInnerdemo();
		pp.demo();

	}

}
