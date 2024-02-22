package arrays;

public class Array_Of_Object {

	public static void main(String[] args) {
		Object [][] arr= {
				{"Sam",33,5.4,'M'},
				{"John",30,6.3,'M'},
				{"Sandy",35,6.0,'F'}
				};
		for(Object [] x : arr) {
			for(Object y: x) {
				System.out.println(y);
			}
			System.out.println("---------");
		}
	}

}
