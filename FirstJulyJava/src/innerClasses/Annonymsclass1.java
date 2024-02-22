package innerClasses;
abstract class Demo1{
	public abstract void show();
}
public class Annonymsclass1 {

	public static void main(String[] args) {
		Demo1 obj=new Demo1(){
						public void show() {
							System.out.println("This is overrided show..");
						}
					};
		obj.show();

	}

}
