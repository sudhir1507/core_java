package objectClass;
class Test{
	String no;
	Test(String x){
		no=x;
	}
	public boolean equals(Object o) {
		Test t=(Test)o;
		if(this.no.equals(t.no))
			return true;
		else
			return false;
	}
	public int hashCode() {
		return 100;
	}
}
public class ObjectClassHashcodeM {

	public static void main(String[] args) {
		Test t1=new Test("abc");
		Test t2=new Test(new String("abc"));
		System.out.println("Hash Code of t1 "+System.identityHashCode(t1));
		System.out.println("Hash code of t2 "+System.identityHashCode(t2));
		if(t1.equals(t2)) {
			System.out.println("Two objects are equals");
			System.out.println("User Hash Code of t1 "+t1.hashCode());
			System.out.println("User Hash code of t2 "+t2.hashCode());
			
		}else {
			System.out.println("Two Objects Are not equal");
		}

	}

}
