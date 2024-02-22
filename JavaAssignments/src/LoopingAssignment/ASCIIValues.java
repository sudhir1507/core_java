package LoopingAssignment;

public class ASCIIValues {

	public static void main(String[] args) {
		char ch=0;
		for(int i=0;i<256;i++) {
			System.out.println((int)(ch++)+"----"+ch++);
		}

	}

}
