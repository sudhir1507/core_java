package WrapperClasses;

public class ByteApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bb=34;
		 Byte bbb=Byte.valueOf(bb);
		 
		 int i=bbb.intValue();
		 float ff=bbb.floatValue();
		 long ll=bbb.longValue();
		 String ss=bbb.toString();
		 
		 System.out.println(i);
		 System.out.println(ff);
		 System.out.println(ll);
		 System.out.println(ss);
	}

}
