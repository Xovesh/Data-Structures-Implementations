package linkedliststack;

public class Test {
	
	public static void main(String[] args) {
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Visualize stack");
		System.out.println(stack);
		System.out.println("Visualize the top element");
		System.out.println(stack.peek());
		System.out.println("pop an element");
		System.out.println(stack.pop());
		System.out.println("Visualize stack");
		System.out.println(stack);
		System.out.println("Size");
		System.out.println(stack.size());
	}
}
