package Pattern;

public class ZeroOnePyramid {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=1;j<6;j++) {
			    if(i>=j) {
			    	if(j%2==0) {
			    		System.out.print("");
			    	}
			    	System.out.print("1");
			    }else {
			    	System.out.print("0");
			    }
			}
			System.out.println();
		}

	}

}
