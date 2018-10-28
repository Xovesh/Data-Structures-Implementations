package test;

import doublelinkedlist.*;

public class OrderedListTest {

	public static void main(String[] args) {
		DoubleOrderedList<Integer> list = new DoubleOrderedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(0);
		System.out.println("List Content");
		System.out.println(list);
		
		System.out.println("List first item");
		System.out.println(list.first());
		
		System.out.println("List last item");
		System.out.println(list.last());
		
		System.out.println("List size");
		System.out.println(list.size());
		
		System.out.println("Remove first item");
		list.removeFirst();
		System.out.println(list);
		
		System.out.println("Remove last item");
		list.removeLast();
		System.out.println(list);
		
		
		System.out.println("List content with more items");
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(2);
		list.add(5);
		System.out.println(list);
		
		System.out.println("Remove element");
		list.remove(5);
		System.out.println(list);

	}

}
