package list;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		/*
		 * ArrayList implementation list interface
		 * ArrayList supports creation of dynamic arrays
		 *  
		 */
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("red");
		arr.add("yellow");
		arr.add("green");
		arr.add("green");
		arr.add("pink");
		arr.add("black");
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(4));
		
		arr.set(4, "gray");
		System.out.println(arr.get(4));
		
//		arr.clear();
//		 arr.remove(0);
//		 arr.remove("yellow");
		
		System.out.println(arr.indexOf("green"));
		System.out.println(arr.lastIndexOf("green"));
		System.out.println(arr.contains("white"));
		
		List<String> arr2=arr.subList(2, 4);
		System.out.println(arr2);
//		System.out.println(arr.subList(2, 4));
		
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		System.out.println("list "+arr);
		System.out.println("---------");
		
		for(String x:arr) {
			System.out.println(x);
		}

	}

}
