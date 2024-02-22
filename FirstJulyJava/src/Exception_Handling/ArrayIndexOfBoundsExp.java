package Exception_Handling;

public class ArrayIndexOfBoundsExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[6]=9;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out of bounds..");
		}
	}

}
