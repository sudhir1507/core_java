package Day8;

public class ArrayCheckerApp {
	public static <T> boolean arrayCheck(T[] array1,T[] array2) {
		if(array1.length!=array2.length) {
			return false;
		}else {
			for (int i = 0; i < array2.length; i++) {
				if(!array1[i].equals(array2[i])) {
					return false;
				}
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Integer[] array1=new Integer[] {1,2,3,4,5};
		Integer[] array2=new Integer[] {1,2,3,4,5};
		
		if(arrayCheck(array1, array2)) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are NOT equal");
		}
	}

}
