package practice;
class Test{
	int x;
	public Test(int x) {
		this.x=x;
	}
	public boolean equal(Object o) {
		Test t2=(Test)o;
		if(t2.x==this.x) {
			return true;
		}else {
			return false;
		}
	}
	public int hashCode() {
		return x*100;
	}
}
public class ObjectCompApp {

	public static void main(String[] args) {
		Test t=new Test(100);
		Test t1=new Test(100);
		if(t.equal(t1)) {
			System.out.println("equal "+"hashcode "+System.identityHashCode(t)+"\t"+System.identityHashCode(t1));
		   System.out.println(t.hashCode()+"\t"+t1.hashCode());
		}else {
			System.out.println("Not equal ");
		}

	}

}
