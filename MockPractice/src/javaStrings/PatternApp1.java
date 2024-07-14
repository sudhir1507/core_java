package javaStrings;
//         5
//       4   5
//     3   4   5
//   2   3   4   5
// 1   2   3   4   5
public class PatternApp1 {

	public static void main(String[] args) {
		int k=7;
		for(int i=1;i<=6;i++) {
			boolean flag=true;
		    k--;
		    int l=k;
			for(int j=1;j<=9;j++) {
				if(j>6-i&&j<4+i&&flag) {
					System.out.print(l++);
					flag=false;
				}else {
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}

	}

}
