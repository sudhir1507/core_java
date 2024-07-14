package javaStrings;
//        A  B  C  D  E
//         1  2  3  4
//           F  G  H
//            1   2
  //            I

public class Pattern2 {

	public static void main(String[] args) {
//		int k=1;
//		char c='A';
//		for(int i=0;i<5;i++) {
//			boolean flag=true;
//			k=1;
//			for(int j=0;j<9;i++) {
//				if(j>=i&&)
//			}
//		}
//		boolean flag=false;
//		for(int i=1;i<=5;i++)
//		{
//			int num=9;
//			for(int j=1;j<=9;j++)
//			{
//				if(j>=6-i && j<=4+i && flag)
//				{
//					System.out.print(num);
//					flag=false;
//				}
//				else {
//					System.out.print(" ");
//					flag=true;
//					num=num-2;
//				}
//			}
//			System.out.println();
//		}
//		boolean flag=true;
//		for(int i=1;i<=5;i++)
//		{
//			int num=1;
//			for(int j=1;j<=9;j++)
//			{
//				if(j>=6-i && j<=4+i && flag)
//				{
//					if(i==3)
//					{
//						System.out.print(3);
//					}
//					else if(i==5){
//						System.out.print(1);
//					}
//					else {
//						System.out.print(num);
//					}
//					flag=false;
//				}
//				else {
//					num=num+1;
//					System.out.print(" ");
//					flag=true;
//				}
//			}
//			System.out.println();
//		}
		int no=1;
		char ch='A';
		boolean flag=true;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j>=i && j<=10-i && flag)
				{
					if(i%2==1)
					{
						System.out.print(ch++);
						flag=false;
					}
					else {
						System.out.print(no++);
						flag=false;
					}
					
				}
				else {
					System.out.print(" ");
					flag=true;
				}
				
			}
			System.out.println();
		}
	}

}
