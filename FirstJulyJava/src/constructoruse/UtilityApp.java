package constructoruse;
class UtilityClas{
	private UtilityClas() {
        }
	public static void show() {
		System.out.println("This is static method of utility class");
	}
}
public class UtilityApp {

	public static void main(String[] args) {
		UtilityClas.show();
	}

}
