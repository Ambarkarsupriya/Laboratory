import java.util.*;

public class ArrayList {

	public static void main(String[] args) {

		ArrayList<String> list_1 = new ArrayList<String>();
			ArrayList list_2 = new ArrayList();
		list_1.add("hai");
		list_1.add("hello");
		list_1.add("hey");

		list_1.add("coder");
		System.out.println("list_1: " + list_1);
		list_2.addAll(list_1);
		System.out.println("list_2: " + list_2);
		System.out.println("Element at index 2 is " + list_1.get(2));
		System.out.println("Last index of element hello is " + list_1.lastIndexOf("hello"));
		System.out.println("\nList before update: " + list_1);
		
		list_1.set(1, "programmer");
		System.out.println("\nList after update: " + list_1);
		list_1.remove(1);
		System.out.println("\nList after removing element from index 1:\n" + list_1);
		
		list_1.remove("coder");
		System.out.println("\nList after removing \'Tutorial\' element:\n" + list_1);
		
		list_1.removeAll(list_2);
		System.out.println("\nList after removing all elements of list_2 from list_1:\n" + list_1);
	}
}