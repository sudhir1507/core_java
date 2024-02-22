package PracticeJava;

public class MaxMarks {

	public static void main(String[] args) {
		int marks[]= {50,80,23,68,0,74};
		MaxMarks m=new MaxMarks();
		int maxm=m.maxmarks(marks);
		System.out.println("maximum marks is "+maxm);
	}

	public  int maxmarks(int[] marks) {
		int max=0;
		for(int mark:marks) {
			if(max<mark) {
				max=mark;
			}
		}
		return max;
	}

}
