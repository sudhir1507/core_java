package PracticeJava;
interface Inter{
	void show();
}
abstract class BB implements Inter{
     public void show() {
    	 System.out.println("jfk");
     }
}
class CC extends BB{
	
}
public class InterApp {

	public static void main(String[] args) {
		
     CC b=new CC();
     b.show();
	}

}
