package TwoStacks;

public class test {

	public static void main(String[] args) {
		GenericArrayStack<String> a = new GenericArrayStack<String>(4);
		
		// push 2 items each and visualize
		System.out.println("\nAdding elements");
		a.push("a");
		a.push("b");
		a.push2("1");
		a.push2("2");
		a.visualize();
		// checking peeks
		System.out.println("\nchecking the peeks of both");
		System.out.println("peek1 " + a.peek());
		System.out.println("peek2 " + a.peek2());
		// checking sizes
		System.out.println("\nchecking the size of both");
		System.out.println("size1 " + a.size());
		System.out.println("size2 " + a.size2() + "\n");
		// checking limits we need to resize
		System.out.println("\npushing something to resize");
		a.push("c");
		a.visualize();
		// checking again peeks after resize
		System.out.println("\nchecking the peeks of both after resize");
		System.out.println("peek1 " + a.peek());
		System.out.println("peek2 " + a.peek2());
		// checking again sizes after resize
		System.out.println("\nchecking the size of both after resize");
		System.out.println("size1 " + a.size());
		System.out.println("size2 " + a.size2() + "\n");
		
		// pop 1 item from stack1 and 2 from stack 2 one of each and visualize
		System.out.println("\npoped some elements");
		a.pop();
		a.pop2();
		a.pop2();
		a.visualize();
		// check if is empty
		System.out.println("\nchecking empty function works");
		System.out.println("empty1 " + a.isEmpty());
		System.out.println("empty2 " + a.isEmpty2());
		
	}

}
