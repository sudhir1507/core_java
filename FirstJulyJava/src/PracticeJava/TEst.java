package PracticeJava;

class ArrayList<T, E>
{
	Object arry[];
	int capacity;
	int s;
	ArrayList() {
		capacity = 10;
		s = 0;
		arry = new Object[capacity];

	}

	void Add(T obj) {

		arry[s++] = (T) obj;

	}

	Object Get(int index) {
		return arry[index];

	}

	int Size() {
		return s;
	}

	boolean IsEmpty() {
		if (s == 0) {
			return true;
		} else {

			return false;

		}

	}
}

public class TEst {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		System.out.println(a.Size());

		System.out.println(a.IsEmpty());
		a.Add(10);
		a.Add("Sanjay");
		a.Add(3.3);

		for (int i = 0; i < a.Size(); i++) {

			System.out.println(a.Get(i));
		}

	}

}
