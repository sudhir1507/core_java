package objectClass;

public class GetClassMethod {

	public static void main(String[] args) {
		String str=new String("Abc");
		
		Class c=str.getClass();
		
		System.out.println(c.getName());
	}

}
