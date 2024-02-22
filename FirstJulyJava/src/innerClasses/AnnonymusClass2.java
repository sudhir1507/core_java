package innerClasses;
interface Eatable{
	void eat();
}
public class AnnonymusClass2 {

	public static void main(String[] args) {
		Eatable ee=new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("eat regularly..");
				
			}
		};
		ee.eat();

	}

}
