package TwoStacks;

public class GenericArrayStack<T> implements StackADT<T> {
	/**
	 * constant to represent the default capacity of the array
	 */
	private final int DEFAULT_CAPACITY = 100;

	/**
	 * int that represents both the number of elements and the next available
	 * position in the array
	 */
	private int top1;
	private int top2;

	/**
	 * array of generic elements to represent the stack
	 */
	private T[] stack;

	/**
	 * Creates an empty stack using the default capacity.
	 */
	public GenericArrayStack() {
		top1 = 0;
		this.stack = (T[]) (new Object[DEFAULT_CAPACITY]);
		top2 = this.stack.length - 1;
	}

	/**
	 * Creates an empty stack using the specified capacity.
	 * 
	 * @param initialCapacity
	 *            represents the specified capacity
	 */
	public GenericArrayStack(int initialCapacity) {
		top1 = 0;
		this.stack = (T[]) (new Object[initialCapacity]);
		top2 = this.stack.length - 1;
	}

	/**
	 * Adds the specified element to the top of this stack, expanding the capacity
	 * of the stack array if necessary.
	 * 
	 * @param element
	 *            generic element to be pushed onto stack
	 */
	public void push(T element) {
		if (size() == this.stack.length || top1>top2)
			expandCapacity();
		
		this.stack[top1++] = element;
	}

	public void push2(T element) {
		if (size() == this.stack.length || top2<top1)
			expandCapacity();

		this.stack[top2--] = element;
	}

	/**
	 * Removes the element at the top of this stack and returns a reference to it.
	 * 
	 */
	public T pop() {
		if (isEmpty())
			return null;

		T result = this.stack[top1--];
		this.stack[top1] = null;

		return result;
	}

	public T pop2(){
		if (isEmpty2())
			return null;

		T result = this.stack[++top2];
		this.stack[top2] = null;

		return result;
	}

	/**
	 * Returns a reference to the element at the top of this stack. The element is
	 * not removed from the stack. 
	 */
	public T peek(){
		if (isEmpty())
			return null;

		return this.stack[top1 - 1];
	}

	public T peek2() {
		if (isEmpty2())
			return null;

		return this.stack[top2 + 1];
	}

	/**
	 * Returns true if this stack is empty and false otherwise.
	 * 
	 * @return boolean true if this stack is empty, false otherwise
	 */
	public boolean isEmpty() {
		return (top1 == 0);
	}

	public boolean isEmpty2() {
		return (top2 == this.stack.length - 1);
	}

	/**
	 * Returns the number of elements in this stack.
	 * 
	 * @return int the number of elements in this stack
	 */
	public int size() {
		return top1;
	}

	public int size2() {
		return this.stack.length - 1 - top2;
	}

	/**
	 * Returns a string representation of this stack.
	 * 
	 * @return String representation of this stack
	 */
	public String toString() {
		String result = "";
		for (int scan = 0; scan < this.stack.length; scan++) {
			if (this.stack[scan] != null) {
				result = result + this.stack[scan].toString() + "\n";
			}
		}
		return result;

	}
	
	public void visualize() {
		for (int scan = 0; scan < this.stack.length; scan++) {
			System.out.println(this.stack[scan]);
		}
		
	}

	/**
	 * Creates a new array to store the contents of this stack with twice the
	 * capacity of the old one.
	 */
	private void expandCapacity() {
		T[] larger = (T[]) (new Object[this.stack.length * 2]);

		for (int index = 0; index < top1; index++)
			larger[index] = this.stack[index];
		
		int x = size2();
		for (int index = 0; index < x; index++)
			larger[larger.length-1-index] = this.stack[this.stack.length-1-index];

		this.stack = larger;
		this.top2 = larger.length - 1 - x;
	}
}
