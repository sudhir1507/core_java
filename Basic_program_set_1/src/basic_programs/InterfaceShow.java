package basic_programs;

interface Abc
{
	void show();
}

public class InterfaceShow {

	public static void main(String[] args) {
		Abc a = () -> System.out.println("show method");
		a.show();
	}
}
