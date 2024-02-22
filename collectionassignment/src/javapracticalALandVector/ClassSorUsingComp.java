package javapracticalALandVector;

import java.util.*;

class Test {
	int tid, sal;
	String tname;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Test(int tid, int sal, String tname) {
		super();
		this.tid = tid;
		this.sal = sal;
		this.tname = tname;
	}

	public Test() {

	}

	@Override
	public String toString() {
		return "Test [tid=" + tid + ", sal=" + sal + ", tname=" + tname + "]";
	}

}

public class ClassSorUsingComp {

	public static void main(String[] args) {

		ArrayList<Test> al = new ArrayList();

		al.add(new Test(101, 5600, "abc"));
		al.add(new Test(30, 5400, "xyz"));
		al.add(new Test(40, 300, "mmm"));

		Test t = new Test();

		al.sort((s1, s2) -> s1.getTid() - s2.getTid());

		System.out.println("Data:\n" + al);
	}
}
