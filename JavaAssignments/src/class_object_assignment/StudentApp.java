package class_object_assignment;

import java.util.Scanner;

class Student{
	int s[],sum=0;
	double per;
	void setSubMarks(int s[]) {
		this.s=s;
	}
	void calculatePer() {
		for(int i=0;i<s.length;i++) {
			sum=sum+s[i];
		}
		per=(sum*100)/600;
	}
	void checkGrades() {
		if(per>75&&per<=100) {
			System.out.println("In Distinction..");
		}else if(per>60&&per<=75) {
			System.out.println("In First Division..");
		}else if(per>50&&per<=60) {
			System.out.println("In Second Division..");
		}else if(per>40&&per<=50){
			System.out.println("In third Division..");
		}else {
			System.out.println("Failed..");
		}
	}
}
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the six Subject marks :");
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.nextInt();
		}
		Student ss=new Student();
		ss.setSubMarks(s);
		ss.calculatePer();
		ss.checkGrades();
		sc.close();
	}

}
