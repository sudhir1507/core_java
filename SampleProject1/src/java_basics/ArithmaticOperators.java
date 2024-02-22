package java_basics;

//class A{
//	public void show() {
//		System.out.println("in A");
//	}
//}
//class B extends A{
//	public void show() {
//		System.out.println("in B");
//	}
//}
//class C extends A{
//	public void show() {
//		System.out.println("in C");
//	}
//}
//class Student{
//	private int rollno;
//	private String name;
//	public int getrollno() {
//		return rollno;
//	}
//	public void setrollno(int rollno) {
//		this.rollno=rollno;
//	}
//	public String getname() {
//		return name;
//	}
//	public void setname(String name) {
//		this.name=name;
//	}
//}

//abstract class Bike{
//	abstract void run();
//	Bike(){
//		System.out.println("im bike");
//	}
//	public static void add() {
//		System.out.println("noo");
//	}
//}
//class Honda extends Bike{
//	void run() {
//		System.out.println("running ");
//	}
//}
interface Bank{
	float rateofinterest();
}
class Sbi implements Bank{
	public float rateofinterest() {
             return 9.29f;
	}
}
class Pnb implements Bank{
	public float rateofinterest() {
		return 9.59f;
	}
}

public class ArithmaticOperators {
	public static void main(String[] args) {
//		int num1=100;
//		int num2=9;
//		int num3=num1/num2;
//		System.out.println(num3);
//		A obj= new A();
//		obj.show();
//		Student obj=new Student();
//		obj.setrollno(33);
//		obj.setname("sudhir");
//		System.out.println(obj.getrollno());
//		System.out.println(obj.getname());
//		Bike obj=new Honda();
//		obj.run();
//		obj.add();
//		int year=2022;
//		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
//			System.out.println("leap year");
//		}else {
//			System.out.println("comman year");
//		}
		Bank b=new Pnb();
		System.out.println(b.rateofinterest());
	}

}
