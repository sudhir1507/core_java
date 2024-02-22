package StringUse;

public class StringEvenLengthwords {
	public static void printwords(String str) {
		for(String word: str.split(" ")) {
			if(word.length()%2==0) {
				System.out.println(word);
			}
		}
	}
	public static void main(String[] args) {
		
		String str="i am java coder, and this is java platform";
		printwords(str);
	}
}
